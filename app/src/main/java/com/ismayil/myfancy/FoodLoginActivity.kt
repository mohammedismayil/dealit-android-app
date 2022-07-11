package com.ismayil.myfancy

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
//import wallet.core.jni.HDWallet
class FoodLoginActivity : AppCompatActivity() {

    init {
        System.loadLibrary("TrustWalletCore")
    }
    private val seedPhrase = "ripple scissors kick mammal hire column oak again sun offer wealth tomorrow wagon turn fatal"
    private val passphrase = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_login)
//        val wallet = HDWallet(seedPhrase, passphrase)


        // get reference to button
        val btn_click_me = findViewById(R.id.button_login) as Button
// set on-click listener
        btn_click_me.setOnClickListener {
            Toast.makeText(this,"button 1 clicked", Toast.LENGTH_SHORT).show()
        }




    }
}