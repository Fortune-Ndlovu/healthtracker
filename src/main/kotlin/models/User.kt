package models

/**
 * Represents a user in the health Tracker.
 * @property id The user's unique identifier
 * @property name The user's full name
 * @property email The user's email address
 * @property weight The user's weight
 * @property height The user's height
 * @property gender The user's gender
 */

data class User (
    var id: Int = -1,
    var name: String = "no name yet",
    var email: String = "no email yet",
    var weight: Double = 0.0,
    var height: Float = 0.00f,
    var gender: Char = 'O'
)