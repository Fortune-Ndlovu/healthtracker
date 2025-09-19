import models.User

var user = User()

fun main() {
    println("Welcome to Health Tracker")
    runApp()
}

fun addUser() {
    println("Please enter the following for the user:")
    println("   Name: ")
    user.name = readln()
    println("   Email: ")
    user.email = readln()
    println("   Id: ")
    user.id = readln().toIntOrNull() ?: -1
}

fun listUser() {
    println("The user details are: $user")
}

fun menu(): Int {
    print("""
    |Main Menu:
    |   1. Add User
    |   2. List User
    |   0. Exit
    |Please enter an option: """.trimMargin())
    return readlnOrNull()?.toIntOrNull() ?: -1
}

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