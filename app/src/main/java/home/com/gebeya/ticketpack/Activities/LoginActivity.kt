package home.com.gebeya.ticketpack.Activities

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import androidx.core.content.ContextCompat.startActivity
import home.com.gebeya.ticketpack.Models.LoginResponse
import home.com.gebeya.ticketpack.R
import home.com.gebeya.ticketpack.Service.ServiceBuilder
import home.com.gebeya.ticketpack.Service.UserService
import home.com.gebeya.ticketpack.framework.base.BaseActivity
import kotlinx.android.synthetic.main.login.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        createAcntTxtViw.setOnClickListener {
            d("Text Clicked")
            val intent1=Intent(this,
                RegisterActivity::class.java)
            startActivity(intent1)
        }
        loginbutton.setOnClickListener {
           val passw= lginPassword.text.toString().trim()
            val usrnme=lginUserName.text.toString().trim()
            if(usrnme.isEmailValid()==false)
            {
                d("Invalid email")
                lginUserName.error="Enter a valid Email"
                lginUserName.requestFocus()
                return@setOnClickListener
            }


            if(passw.isEmpty())
            {
                lginPassword.error="Password required"
                lginPassword.requestFocus()
                return@setOnClickListener
            }
            if(usrnme.isEmpty())
            {
                lginUserName.error="Email required"
                lginUserName.requestFocus()
                return@setOnClickListener
            }
                 else
             {
                d("else")
                 lauchintent()
             }
               // **************Retrofit********************************************
/*
                val userService: UserService = ServiceBuilder.buildService(UserService::class.java)


                val requestCall: Call<LoginResponse>
                //requestCall= userService.loginuser("abcdlogin@yahoo.com","1234login")
                requestCall= userService.login("aaa@test.com","aaa")

                d(requestCall.request().toString())

                requestCall.enqueue(object: Callback<LoginResponse> {

                    override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {

                        if(response.isSuccessful){
                            d("Works")

                            val loginrsp= response.body()

                            //d(loginrsp.token)
                            lauchintent()

                        }
                    }

                    override fun onFailure(call: Call<LoginResponse>?, t: Throwable?) {
                        d("Fail")
                        //lauchintent()
                        t?.printStackTrace()
                        //lauchintent()
                    }
                }) */
// **************Retrofit********************************************





        }
    }
    fun lauchintent (){
        val intent1 = Intent(this, HomeActivity::class.java)
        //intent.flags=Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent1)
    }
    fun String.isEmailValid(): Boolean {
        return !TextUtils.isEmpty(this) && android.util.Patterns.EMAIL_ADDRESS.matcher(this).matches()
    }
}
