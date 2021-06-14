package com.fatihsenturk.odev

import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.net.NetworkInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var context : Context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(myToolbar)

        button.setOnClickListener { val intent = Intent(this, HakkimdaActivity::class.java)
        startActivity(intent)
        }

        if(checkConnection(context)){
            Toast.makeText(this,"bağlantı başarılı",Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(this,"bağlantı başarısız!!!", Toast.LENGTH_SHORT).show()
        }
    }
    fun checkConnection(context: Context) : Boolean{
        val connectivityManager : ConnectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo : NetworkInfo? = connectivityManager.activeNetworkInfo
        return networkInfo != null && networkInfo.isConnected


    }
}

