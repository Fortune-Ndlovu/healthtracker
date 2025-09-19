import models.User

var user = User()

fun main() {
    println("Welcome to Health Tracker")
    println("Please enter the following for the user:")
    println("   Name: ")
    user.name = readLine()!!
    println("   Email: ")
    user.email = readLine()!!
    println("   Id: ")
    user.id = readLine()!!.toIntOrNull() ?: -1
    println("The user details are: " + user)
}