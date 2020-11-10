package home.com.gebeya.ticketpack

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import home.com.gebeya.ticketpack.Models.Discoveritem
import kotlinx.android.synthetic.main.discover_list_item.view.*

import java.util.ArrayList

class Discoveradapter: RecyclerView.Adapter<RecyclerView.ViewHolder>()

{
    private var items: List<Discoveritem> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return DiscoverviewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.discover_list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is DiscoverviewHolder-> {
                holder.bind(items.get(position))
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitlist(discovlist: List<Discoveritem>) {
        items = discovlist
    }

    class DiscoverviewHolder(itemview: View) : RecyclerView.ViewHolder(itemview){

        //val qq=itemview.editText1
        val evheader=itemview.evhedtextview
        val imgdis1=itemview.imageViewdisc
        val p1= itemview.p1
        val et1= itemview.et1
        val descp1=itemview.descp1
        val venue1=itemview.venue1
        val imgdis2=itemview.imageViewdiscz
        val p2= itemview.p2
        val et2= itemview.et2
        val descp2=itemview.descp2
        val venue2=itemview.venue2

        fun bind (discvitem:Discoveritem) {
            //qq.setText(regis.quest)
            evheader.text=discvitem.eventheader
        imgdis1.setImageResource(discvitem.eventimage1)
            p1.text=discvitem.price1
            et1.text=discvitem.eventTittle1
            descp1.text=discvitem.description1
            venue1.text=discvitem.venue1
        imgdis2.setImageResource(discvitem.eventimage2)
            p2.text=discvitem.price2
            et2.text=discvitem.eventTittle2
            descp2.text=discvitem.description2
            venue2.text=discvitem.venue2
        }
    }

}