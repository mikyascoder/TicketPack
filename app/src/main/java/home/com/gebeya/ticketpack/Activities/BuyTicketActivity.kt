package home.com.gebeya.ticketpack.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import home.com.gebeya.ticketpack.R
import kotlinx.android.synthetic.main.activity_buy_ticket.*

class BuyTicketActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buy_ticket)

        buyTktNxt.setOnClickListener {
            val intent = Intent(this, PayActivity::class.java)
            startActivity(intent)
        }
    }
}
