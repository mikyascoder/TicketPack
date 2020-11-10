package home.com.gebeya.ticketpack

import home.com.gebeya.ticketpack.Models.Discoveritem
import home.com.gebeya.ticketpack.Models.Homeitem
import home.com.gebeya.ticketpack.Models.Interest
import home.com.gebeya.ticketpack.Models.Regis

class DataSource {
    companion object {
    fun createDataSet():ArrayList<Regis>{
        val lis=ArrayList<Regis>()
        lis.add(Regis("Phone Number/Email"))
        lis.add(Regis("Password"))
        lis.add(Regis("Confirm password"))
        lis.add(Regis("First Name"))
        lis.add(Regis("Last Name"))
        lis.add(Regis("User Name"))
        lis.add(Regis("Age"))
        lis.add(Regis("Payment Method"))
        lis.add(Regis("City"))
        return lis
    }

        fun createDiscover():ArrayList<Discoveritem>{
            val dlis=ArrayList<Discoveritem>()
            dlis.add(Discoveritem("Recommended",R.drawable.badb,"Bad Boys","Action Comedy","Alem Cinema",R.drawable.sball,"50 birr","St George VS Bunna ","Ethio League","Addis Ababa Stadium","45 birr"))
           dlis.add(Discoveritem("",R.drawable.rp,"Rophnan","Concert","Ghion",R.drawable.td,"150 birr","Teddy Afro ","Concert","Addis Ababa Stadium","100 birr"))
            dlis.add(Discoveritem("Trending",R.drawable.trt,"Bad Boys","Action Comedy","Alem Cinema",R.drawable.sb,"50 birr","St George VS Fasil ","Ethio League","Addis Ababa Stadium","45 birr"))
            dlis.add(Discoveritem("",R.drawable.bb,"Bad Boys","Action Comedy","Alem Cinema",R.drawable.sb,"50 birr","St George VS Fasil ","Ethio League","Addis Ababa Stadium","45 birr"))
            dlis.add(Discoveritem("Featured",R.drawable.bb,"Bad Boys","Action Comedy","Alem Cinema",R.drawable.sb,"50 birr","St George VS Fasil ","Ethio League","Addis Ababa Stadium","45 birr"))
            dlis.add(Discoveritem("",R.drawable.bb,"Bad Boys","Action Comedy","Alem Cinema",R.drawable.sb,"50 birr","St George VS Fasil ","Ethio League","Addis Ababa Stadium","45 birr"))
            return dlis
        }


        fun createInterest():ArrayList<Interest>{
            val Intlis=ArrayList<Interest>()
            Intlis.add(Interest("Movie","English","Amharic","Action","Comedy","Crime","Sci-Fi "))
            Intlis.add(Interest("Theater","Comedy","Drama","Historical","Musical","Satire",""))
            Intlis.add(Interest("Soccer","Adama city","Giorgis","Buna","Wolayta Ditcha","BahirDar K","Mekele 70 "))
            Intlis.add(Interest("Concert","Outdoor","Indoor","Festival","Day","Night",""))

            return Intlis
        }

        fun createHome():ArrayList<Homeitem>{
            val hmlis=ArrayList<Homeitem>()
            hmlis.add(Homeitem(R.drawable.badb,"150 Birr","Bad Boys","Action Comedy","Alem Cinema"))
            hmlis.add(Homeitem(R.drawable.trt,"200 Birr","Negus","Theater","National Theater"))
            hmlis.add(Homeitem(R.drawable.rp,"150 Birr","Rophnan","Concert","Ghion"))
            hmlis.add(Homeitem(R.drawable.badb,"150 Birr","Bad Boys","Action Comedy","Alem Cinema"))
            hmlis.add(Homeitem(R.drawable.trt,"200 Birr","Negus","Theater","National Theater"))
            hmlis.add(Homeitem(R.drawable.rp,"150 Birr","Rophnan","Concert","Ghion"))

            return hmlis
        }

    }
}