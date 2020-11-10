package home.com.gebeya.ticketpack.Activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import home.com.gebeya.ticketpack.DataSource
import home.com.gebeya.ticketpack.Models.SignupResponse
import home.com.gebeya.ticketpack.R
import home.com.gebeya.ticketpack.Regadapter2
import home.com.gebeya.ticketpack.Service.ServiceBuilder
import home.com.gebeya.ticketpack.Service.UserService
import home.com.gebeya.ticketpack.framework.base.BaseActivity
import kotlinx.android.synthetic.main.register3.*
import kotlinx.android.synthetic.main.registern.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RegisterActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registern)





        zregNxtBtn.setOnClickListener {
            val pnoemail= phoneNoEmail.text.toString().trim()
            val passwd= password.text.toString().trim()
            val confpasswd= confirmPassword.text.toString().trim()
            if(pnoemail.isEmpty())
            {
                phoneNoEmail.error="Phone/Email required"
                phoneNoEmail.requestFocus()
                return@setOnClickListener
            }



            if(passwd.isEmpty())
            {
            password.error="Enter password"
            password.requestFocus()
            return@setOnClickListener
            }

            if(confpasswd.isEmpty())
            {
                confirmPassword.error="Please confirm password"
                confirmPassword.requestFocus()
                return@setOnClickListener
            }

             else
            {
                val intent = Intent(this, InterestActivity::class.java)
                startActivity(intent)
            }



        }



    }





}
