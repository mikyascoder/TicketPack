package home.com.gebeya.ticketpack.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Dog
      (@SerializedName("message")
       @Expose
      var message:String){
}