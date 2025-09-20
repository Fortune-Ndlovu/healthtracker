import models.User

/**
 * Global user instance for the Heath Tracker.
 *
 * This variable stores the current user's data throughout
 * the application session. It's initialized as an empty User
 * object and populated when the user adds their information.
 */
var user = User()

/**
 * Main entry point of the Heath Tracker.
 *
 * Initializes the application and starts the main application loop.
 */
fun main() {
    println("Welcome to Health Tracker")
    runApp()
}

/**
 * Adds a new user to the Heath Tracker.
 *
 * Prompts the user to enter personal details including name, email, ID,
 * weight, height, and gender. Uses safe parsing with fallback values
 * for numeric inputs.
 */
fun addUser() {
    println("Please enter the following for the user:")
    println("   Name: ")
    user.name = readln()
    println("   Email: ")
    user.email = readln()
    println("   Id: ")
    user.id = readln().toIntOrNull() ?: -1
    println("   Weight: ")
    user.weight = readln().toDoubleOrNull() ?: 0.0
    println("   Height: ")
    user.height = readln().toFloatOrNull() ?: 0.00f
    println("   Gender: ")
    user.gender = readln().firstOrNull()?.uppercaseChar() ?: 'O'
}

/**
 * Displays the current user's details.
 *
 * Prints all stored user information in a formatted string.
 */
fun listUser() {
    println("The user details are: $user")
}

/**
 * Displays the main menu and gets user selection.
 *
 * Shows available options for the health tracker application
 * and returns the user's menu choice.
 *
 * @return The selected menu option as an integer, or -1 if invalid input
 */
fun menu(): Int {
    print("""
    |Main Menu:
    |   1. Add User
    |   2. List User
    |   0. Exit
    |Please enter an option: """.trimMargin())
    return readlnOrNull()?.toIntOrNull() ?: -1
}

/**
 * Runs the main application loop.
 *
 * Continuously displays the menu and processes user input until
 * the user chooses to exit. Handles all menu options including
 * adding users, listing users, and future features.
 */
fun runApp() {
    var input: Int
    do {
        input = menu()
        when(input) {
            1 -> addUser()
            2 -> listUser()
            in (3..6) -> println("Feature coming soon!")
            0 -> println("Byee...")
            else -> println("Invalid Option")
        }
    }   while (input != 0)
}