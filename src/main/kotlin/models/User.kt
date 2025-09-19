package models

data class User (
    var id: Int = -1,
    var name: String = "no name yet",
    var email: String = "no email yet",
    var weight: Double = 0.0,
    var height: Float = 0.00f,
    var gender: Char = 'O'
)