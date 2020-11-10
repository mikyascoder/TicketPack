package home.com.gebeya.ticketpack.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import home.com.gebeya.ticketpack.R
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val color = ContextCompat.getColor(this, R.color.colorNew)
        profileProfLin.setBackgroundColor(color)

        profileProfLin.setOnClickListener {
          //  val color = ContextCompat.getColor(this, R.color.colorNew)
            profileProfLin.setBackgroundColor(color)

        }

        profilediscovlin.setOnClickListener {
           // val color = ContextCompat.getColor(this, R.color.colorNew)
            profilediscovlin.setBackgroundColor(color)
            val intent = Intent(this, DiscoverActivity::class.java)
            startActivity(intent)
        }

        profilehomelin.setOnClickListener {
           // val color = ContextCompat.getColor(this, R.color.colorNew)
            profilehomelin.setBackgroundColor(color)
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        profileCatagLin.setOnClickListener {
           //val color = ContextCompat.getColor(this, R.color.colorNew)
            profileCatagLin.setBackgroundColor(color)
            val intent = Intent(this, CatagoryActivity::class.java)
            startActivity(intent)
        }
    }
}
