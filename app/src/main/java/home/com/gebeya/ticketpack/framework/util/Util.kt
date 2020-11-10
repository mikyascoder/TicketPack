package home.com.gebeya.ticketpack.framework.util



import android.util.Log

private const val TAG = "TicketPack-TAG-Debug"

fun logd(source:Any, message:String){
    val name= source::class.simpleName
    val output = "$name : $message"
    Log.d(TAG,output)
}

