import models.User

var user = User()

fun main() {
    println("Welcome to Health Tracker")
    println("Please enter the following for the user:")
    println("   Name: ")
    user.name = readln()
    println("   Email: ")
    user.email = readln()
    println("   Id: ")
    user.id = readln().toIntOrNull() ?: -1
    println("The user details are: $user")
}