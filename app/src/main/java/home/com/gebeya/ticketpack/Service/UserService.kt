package home.com.gebeya.ticketpack.Service


import home.com.gebeya.ticketpack.Models.Dog
import home.com.gebeya.ticketpack.Models.LoginResponse
import home.com.gebeya.ticketpack.Models.SignupResponse
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface UserService {
    @FormUrlEncoded
    @POST("signup")
    fun createUser(
        @Field("email") email:String,
        @Field("name")  name:String,
        @Field("password") password:String
    ):Call<SignupResponse>



    @FormUrlEncoded
    @POST("login")
    fun login (
        @Field("email") email:String,
        @Field("password") password:String
    ):Call<LoginResponse>




    @GET("v3/c4840288-ca66-479b-9e52-023e1003519b")
    fun signup(

    ):Call<SignupResponse>


}