package home.com.gebeya.ticketpack.Models

import com.google.gson.annotations.SerializedName

data class User(
    val role:String,val interests: List<Object> = listOf(), val name:String, val _id:String, val email:String,  val password: String,
    val tickets: List<Object> = listOf(),

    @SerializedName("__v")
    var v:Int
) {
}