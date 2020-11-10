package home.com.gebeya.ticketpack.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import home.com.gebeya.ticketpack.DataSource
import home.com.gebeya.ticketpack.HomeAdapter
import home.com.gebeya.ticketpack.R
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    private lateinit var homeadapter:HomeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val color = ContextCompat.getColor(this, R.color.colorNew)
        homehomelin.setBackgroundColor(color)
        initRecyclerView()
        addDataSet()

        homehomelin.setOnClickListener {
           // val color = ContextCompat.getColor(this, R.color.colorNew)
            homehomelin.setBackgroundColor(color)

        }

        homdiscovlin.setOnClickListener {
           // val color = ContextCompat.getColor(this, R.color.colorNew)
            homdiscovlin.setBackgroundColor(color)
            val intent = Intent(this, DiscoverActivity::class.java)
            startActivity(intent)
        }

        homecataglin.setOnClickListener {
           // val color = ContextCompat.getColor(this, R.color.colorNew)
            homecataglin.setBackgroundColor(color)
            val intent = Intent(this, CatagoryActivity::class.java)
            startActivity(intent)
        }

        homeproflin.setOnClickListener {
          //  val color = ContextCompat.getColor(this, R.color.colorNew)
            homeproflin.setBackgroundColor(color)
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }

    private fun addDataSet() {
        val data =
            DataSource.createHome()
        homeadapter.submitlist(data)
    }

    private fun initRecyclerView() {

        home_recycler.layoutManager = LinearLayoutManager(this)
        homeadapter = HomeAdapter()
        home_recycler.adapter = homeadapter
    }
}
