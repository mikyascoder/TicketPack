package home.com.gebeya.ticketpack

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import home.com.gebeya.ticketpack.Models.Regis
import kotlinx.android.synthetic.main.list_item.view.*
import java.util.*


class Regadapter2: RecyclerView.Adapter<RecyclerView.ViewHolder>()

{
         private var items: List<Regis> = ArrayList()
           //var ls: List<String> = listOf("ab","cd","ef")
           val values : Array<String> = arrayOf("USD", "UAH", "GBD", "EUR", "BIT", "RUB")



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return RegviewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is RegviewHolder-> {
                holder.bind(items.get(position))
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitlist(reglist: List<Regis>) {
        items = reglist
    }

    class RegviewHolder(itemview: View) : RecyclerView.ViewHolder(itemview){

         val qq=itemview.registerTextItem
        val sq=itemview.spin
         fun bind (regis:Regis) {
          //qq.setText(regis.quest)

             qq.hint=regis.quest
            // val languages = resources.getStringArray(R.array.Languages)



             if (regis.quest=="Payment Method" ||regis.quest=="City") {
                 sq.visibility = View.VISIBLE
              //    sq.setSelection(R.array.cities)




                 }

         }

    }

}