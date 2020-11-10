package home.com.gebeya.ticketpack



import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import home.com.gebeya.ticketpack.Activities.BuyTicketActivity

import home.com.gebeya.ticketpack.Models.Homeitem

import kotlinx.android.synthetic.main.home_list_item.view.*

import java.util.ArrayList

class HomeAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>()

{
    private var items: List<Homeitem> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return HomeviewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.home_list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is HomeviewHolder-> {
                holder.bind(items.get(position))
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitlist(discovlist: List<Homeitem>) {
        items = discovlist
    }

    class HomeviewHolder(itemview: View) : RecyclerView.ViewHolder(itemview){

        init {
            itemview.setOnClickListener {
                val posit:Int=adapterPosition
              //  Toast.makeText(itemview.context,"Clicked",Toast.LENGTH_SHORT).show()
                val intent1 = Intent(itemview.context, BuyTicketActivity::class.java)
                itemview.context.startActivity(intent1)
            }
        }

        //val qq=itemview.editText1
        val homimg=itemview.homelistimage
        val homprce=itemview.homelistprice
        val hometxt1=itemview.homelisttext1
        val hometxt2=itemview.homelisttext2
        val hometxt3=itemview.homelisttext3


        fun bind (homeitem:Homeitem) {
            //qq.setText(regis.quest)

            homimg.setImageResource(homeitem.homeimage)
            homprce.text=homeitem.homeprice
            hometxt1.text=homeitem.hometext1
            hometxt2.text=homeitem.hometext2
            hometxt3.text=homeitem.hometext3

        }
    }

}