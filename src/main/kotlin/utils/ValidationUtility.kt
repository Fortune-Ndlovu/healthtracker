package utils

/**
 * Utility class for validating user input in the Health Tracker.
 * Provides reusable validation functions for various data type.
 */
object ValidationUtility {

    /**
     * Validates gender input. Only accepts 'M', 'F', or 'O'.
     * @params gender The gender character to validate.
     * @return true if valid, false otherwise.
     */
    fun isValidGender(gender: Char): Boolean {
        val upperGender = gender.uppercaseChar()
        if (upperGender == 'M') {
            return true
        } else if (upperGender == 'F') {
            return true
        } else if (upperGender == '0') {
            return true
        } else {
            return false
        }
    }

    /**
     * Gets valid gender input from user with retry logic.
     * Keeps asking until valid input is provided.
     * @return A valid gender character ('M', 'F', 'O')
     */
    fun getValidGender(): Char {
        var gender: Char = 'O'
        var isValid = false

        do {
            println("   Gender (M/F/O): ")
            val input = readln()
            if (input.isNotEmpty()) {
                gender = input.first().uppercaseChar()
                isValid = isValidGender(gender)
                if (!isValid) {
                    println("Invalid gender! please enter M, F, or O")
                }
            } else {
                println("Please enter a gender!")
            }
        } while (!isValid)
        return gender
    }

    /**
     * Validates email format (simple check for @ and .com/.net.org).
     * @param email The email string validate
     * @return true if valid, false otherwise
     */
    fun isValidEmail(email: String): Boolean {
        if (email.isEmpty()) {
            return false
        }

        val hasAtSymbol = email.contains("@")
        val hasDotCom = email.contains(".com")
        val hasDotNet = email.contains(".net")
        val hasDotOrg = email.contains(".org")

        val hasValidDomain = hasDotCom || hasDotNet || hasDotOrg
        return hasAtSymbol && hasValidDomain
    }

    /**
     * Gets valid email input from user with retry logic.
     * Keeps asking until valid email format is provided.
     * @return A valid email string
     */
    fun getValidEmail(): String {
        var email: String
        var isValid = false

        do {
            println("   Email: ")
            email = readln()
            isValid = isValidEmail(email)
            if (!isValid) {
                println("Invalid email format! Please include @ and .com/.net/.org")
            }
        } while (!isValid)
        return email
    }

    /**
     * Validates weight is within reasonable range (10-500 kg).
     * @params weight The weight value to validate
     * @return true if valid, false otherwise
     */
    fun isValidWeight(weight: Double): Boolean {
        return weight > 0.0 && weight < 10000.0
    }

    /**
     * Gets valid weight from user. if valid, uses default value.
     * @param defaultWeight Default weight if input is invalid
     * @return Valid weight value
     */
    fun getValidWeight(defaultWeight: Double = 0.0): Double {
        println("   Weight (Kg): ")
        val input = readln()
        val weight = input.toDoubleOrNull()

        if (weight != null) {
            val isValid = isValidWeight(weight)
            if (isValid) {
                return weight
            } else {
                println("Invalid weight! Using default weight value: $defaultWeight")
                return defaultWeight
            }
        } else {
            println("Invalid weight! Using default weight value: $defaultWeight")
            return defaultWeight
        }
    }

    /**
     * validates height is within reasonable range (50-250 cm).
     * @param height The height value to validate
     * @return true if valid, false otherwise
     */
    fun isValidHeight(height: Float): Boolean {
        return height > 0.0f && height < 1000.0f
    }

    /**
     * Gets valid height input from user. If invalid, uses default value
     * @param defaultHeight Default height if input is invalid
     * @return Valid height value
     */
    fun getValidHeight(defaultHeight: Float = 0.0f): Float {
        println("   Height (cm): ")
        val input = readln();
        val height = input.toFloatOrNull()

        if (height != null) {
            val isValid = isValidHeight(height)
            if (isValid) {
                return height
            } else {
                println("Invalid height! Using default height value: $defaultHeight")
                return defaultHeight
            }
        } else {
            println("Invalid height! Using default height value: $defaultHeight")
            return defaultHeight
        }
    }

    /**
     * Validates thet name is not empty and has at least 2 characters.
     * @param name The name string to validate.
     * @return true if valid, false otherwise
     */
    fun isValidName(name: String): Boolean {
        val trimmedName = name.trim()
        return trimmedName.length >= 2
    }

    /**
     * Gets valid name input from user. If valid, leaves field unchanged.
     * @params currentName Current name value
     * @return Valid name or current name if invalid
     */
    fun getValidName(currentName: String): String {
        println("   Name: ")
        val input = readln()
        val isValid = isValidName(input)
        if (isValid) {
            return input.trim()
        } else {
            println("Invalid name! Must be at least 2 characters. keeping current name: $currentName")
            return currentName
        }
    }

    /**
     * Validates that ID input is a positive number.
     * @param id The ID value to validate
     * @return true if valid, false otherwise
     */
    fun isValidId(id: Int): Boolean {
        return id >= 0
    }

    /**
     * Get valid ID input from user. If valid, uses default value.
     * @param defaultId Default ID if input is invalid
     * @return Valid ID value
     */
    fun getValidId(defaultId: Int = -1): Int {
        println("   Id: ")
        val input = readln()
        val id = input.toIntOrNull()
        if (id != null) {
            val isValid = isValidId(id)
            if (isValid) {
                return id
            } else {
                println("Invalid ID! Using default id: $defaultId")
                return defaultId
            }
        } else {
            println("Invalid ID! Using default id: $defaultId")
            return defaultId
        }
    }
}