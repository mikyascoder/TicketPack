package home.com.gebeya.ticketpack.Activities

import android.content.Intent
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import home.com.gebeya.ticketpack.DataSource
import home.com.gebeya.ticketpack.Discoveradapter
import home.com.gebeya.ticketpack.R
import home.com.gebeya.ticketpack.framework.base.BaseActivity
import kotlinx.android.synthetic.main.discover.*
import androidx.core.content.ContextCompat

class DiscoverActivity : BaseActivity() {

    private lateinit var discovadapter: Discoveradapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.discover)
        val color = ContextCompat.getColor(this, R.color.colorNew)
        dsiscovDiscovLin.setBackgroundColor(color)


         initRecyclerView()
          addDataSet()
        dsiscovDiscovLin.setOnClickListener {
       //     val color = ContextCompat.getColor(this, R.color.colorNew)

            dsiscovDiscovLin.setBackgroundColor(color)

        }

        discovcataglin.setOnClickListener {
         //   val color = ContextCompat.getColor(this, R.color.colorNew)
            discovcataglin.setBackgroundColor(color)
            val intent = Intent(this, CatagoryActivity::class.java)
            startActivity(intent)
        }
        discovhomelin.setOnClickListener {
         //   val color = ContextCompat.getColor(this, R.color.colorNew)
            discovhomelin.setBackgroundColor(color)
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        discovproflin.setOnClickListener {
          //  val color = ContextCompat.getColor(this, R.color.colorNew)
            discovproflin.setBackgroundColor(color)
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

    }

    private fun addDataSet() {
        val data =
            DataSource.createDiscover()
        discovadapter.submitlist(data)
    }

    private fun initRecyclerView() {

        discov_recycler.layoutManager = LinearLayoutManager(this)
        discovadapter = Discoveradapter()
        discov_recycler.adapter = discovadapter
    }
}
