package home.com.gebeya.ticketpack.Activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import home.com.gebeya.ticketpack.DataSource
import home.com.gebeya.ticketpack.Interestadapter
import home.com.gebeya.ticketpack.Models.SignupResponse
import home.com.gebeya.ticketpack.R
import home.com.gebeya.ticketpack.Service.ServiceBuilder
import home.com.gebeya.ticketpack.Service.UserService
import home.com.gebeya.ticketpack.framework.base.BaseActivity
import kotlinx.android.synthetic.main.interest.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class InterestActivity : BaseActivity() {

    private lateinit var interestadapter: Interestadapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.interest)

        initRecyclerView()
        addDataSet()


        CrearAcntBtn.setOnClickListener {


             launchActivity()


           /*

           val userService: UserService = ServiceBuilder.buildService(UserService::class.java)

           val requestCall: Call<SignupResponse>

          requestCall= userService.signup()
           d(requestCall.request().toString())

           requestCall.enqueue(object: Callback<SignupResponse> {

               override fun onResponse(call: Call<SignupResponse>, response: Response<SignupResponse>) {
                   if(response.isSuccessful){
                       val suresponse= response.body()
                         val er= suresponse.error
                       d("Mes sage:")
                       Log.d("TicketPack-TAG-Debug","Works")
                       d(suresponse.message)
                       d(suresponse.authToken)
                         if(er == false)
                       launchActivity()

                   }
               }

               override fun onFailure(call: Call<SignupResponse>?, t: Throwable?) {
                   d("Fail")
               }
           })*/









        }
    }

    private fun addDataSet() {
        val data =
            DataSource.createInterest()
        interestadapter.submitlist(data)


    }

    // Register 3
    private fun initRecyclerView() {
        interestrecycler.layoutManager = LinearLayoutManager(this)
        interestadapter = Interestadapter()
        interestrecycler.adapter = interestadapter
    }

    private fun launchActivity(){
        val intent= Intent(this,
            HomeActivity::class.java)
        startActivity(intent)
    }
}

