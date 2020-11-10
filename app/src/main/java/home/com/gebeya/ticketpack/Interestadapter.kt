package home.com.gebeya.ticketpack

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import home.com.gebeya.ticketpack.Models.Interest
import kotlinx.android.synthetic.main.interest_list_item.view.*

import java.util.ArrayList

class Interestadapter: RecyclerView.Adapter<RecyclerView.ViewHolder>()

{
    private var items: List<Interest> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return InterestviewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.interest_list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is InterestviewHolder-> {
                holder.bind(items.get(position))
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitlist(intlist: List<Interest>) {
        items = intlist
    }

    class InterestviewHolder(itemview: View) : RecyclerView.ViewHolder(itemview){

        //val qq=itemview.editText1
     val iheader= itemview.int_text
        val ibutton1= itemview.int_button1
        val ibutton2= itemview.int_button2
        val ibutton3= itemview.int_button3
        val ibutton4= itemview.int_button4
        val ibutton5= itemview.int_button5
        val ibutton6= itemview.int_button6


        fun bind (Intitem:Interest) {
            //qq.setText(regis.quest)
           iheader.text=Intitem.header
            ibutton1.text=Intitem.button1
            ibutton2.text=Intitem.button2
            ibutton3.text=Intitem.button3
            ibutton4.text=Intitem.button4
            ibutton5.text=Intitem.button5
            ibutton6.text=Intitem.button6
        }
    }

}