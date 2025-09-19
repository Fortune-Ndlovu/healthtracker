import models.User

var user = User()

fun main() {
    println("Welcome to Health Tracker")
    addUser()
    listUser()
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
    println("\nMain Menu:")
    println("1. Add User")
    println("2. List User")
    println("0. Exit")
    return readlnOrNull()?.toIntOrNull() ?: -1
}