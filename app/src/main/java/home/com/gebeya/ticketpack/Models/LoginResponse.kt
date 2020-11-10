package home.com.gebeya.ticketpack.Models

data class LoginResponse (
    val user: List<User> = listOf(),
    val token: String,
    val expires_in:Int


) {
}