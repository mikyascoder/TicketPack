package home.com.gebeya.ticketpack.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import home.com.gebeya.ticketpack.R
import kotlinx.android.synthetic.main.category.*

class CatagoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.category)
        val color = ContextCompat.getColor(this, R.color.colorNew)
        catagCatagLin.setBackgroundColor(color)

        catagCatagLin.setOnClickListener {
           // val color = ContextCompat.getColor(this, R.color.colorNew)
            catagCatagLin.setBackgroundColor(color)

        }

        catagDiscvLin.setOnClickListener {
           // val color = ContextCompat.getColor(this, R.color.colorNew)
            catagDiscvLin.setBackgroundColor(color)
            val intent = Intent(this, DiscoverActivity::class.java)
            startActivity(intent)
        }

        catagHomeLin.setOnClickListener {
           // val color = ContextCompat.getColor(this, R.color.colorNew)
            catagHomeLin.setBackgroundColor(color)
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        catagProflLin.setOnClickListener {
            //val color = ContextCompat.getColor(this, R.color.colorNew)
            catagProflLin.setBackgroundColor(color)
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }
}
