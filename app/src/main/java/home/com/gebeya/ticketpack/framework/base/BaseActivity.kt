package home.com.gebeya.ticketpack.framework.base



import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import home.com.gebeya.ticketpack.framework.util.logd


open class BaseActivity: AppCompatActivity () {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        d("----------On Create------------")

    }

    override fun onStart() {
        super.onStart()
        d("On Start")

    }
    override fun onResume() {
        super.onResume()
        d("On Resume")
    }

    override fun onPause() {
        super.onPause()
        d("On Pause")
    }

    override fun onStop() {
        super.onStop()
        d("On Stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        d("--------------On Destroy-------------")
    }

    protected fun d (message:String) {
        logd(this,message)
    }
}