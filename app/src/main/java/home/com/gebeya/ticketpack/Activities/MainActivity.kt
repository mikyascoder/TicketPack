package home.com.gebeya.ticketpack.Activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import home.com.gebeya.ticketpack.Models.Dog
import home.com.gebeya.ticketpack.R
import home.com.gebeya.ticketpack.Regadapter2

import home.com.gebeya.ticketpack.Service.ServiceBuilder
import home.com.gebeya.ticketpack.framework.base.BaseActivity
import kotlinx.android.synthetic.main.front_page.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : BaseActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.front_page)



        buyticketbtn.setOnClickListener{
            val intent= Intent(this, LoginActivity::class.java)
            startActivity(intent)



        }



    }




}