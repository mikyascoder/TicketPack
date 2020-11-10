package home.com.gebeya.ticketpack.Service

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceBuilder {
    //private val okHttp: OkHttpClient.Builder=OkHttpClient.Builder()



   // private const val url= "https://run.mocky.io/"
   private const val url="https://ticketpack-api.apps.et6om.gebeya.co/"

    private val retrofit=Retrofit.Builder().baseUrl(url)
        .addConverterFactory(GsonConverterFactory.create())
        .build()


    //
  //  private val retrofit:Retrofit = builder.build()


    fun <T> buildService(serviceType:Class<T>): T{
        return retrofit.create(serviceType)
    }
}
