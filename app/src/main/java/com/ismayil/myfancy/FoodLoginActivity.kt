package com.ismayil.myfancy

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import wallet.core.jni.CoinType
import wallet.core.jni.HDWallet
import wallet.core.jni.PrivateKey
import wallet.core.jni.StoredKey
import wallet.core.jni.proto.Ethereum

class FoodLoginActivity : AppCompatActivity() {

    init {
        System.loadLibrary("TrustWalletCore")
    }
    private val seedPhrase = "ripple scissors kick mammal hire column oak again sun offer wealth tomorrow wagon turn fatal"
    private val passphrase = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_login)
        val wallet = HDWallet("chapter struggle benefit edit motion slide tribe junior blossom entry orient august","")
//        val privateKeyData = "9cd3b16e10bd574fed3743d8e0de0b7b4e6c69f3245ab5a168ef010d22bfefa0".toByteArray()
//        val privateKey = PrivateKey(privateKeyData)
//
//        val priv = "31f31a1674e45b7c5df4f1adfc7261c8a09ad3bc3e6dec6a23ac2a916e20e4e6".encodeToByteArray()
//
//        val pass = "".encodeToByteArray();

//        val key = StoredKey.importPrivateKey(priv,"ismayil",pass,CoinType.ETHEREUM);
//        Log.d(wallet.mnemonic().toString(),"");
        Log.d("myTag", wallet.getAddressForCoin(CoinType.ETHEREUM));
//        Log.d("myTag",
//            StoredKey.importPrivateKey(privateKeyData,"","".toByteArray(),CoinType.ETHEREUM).decryptPrivateKey("".toByteArray())
//                .toString()
//        );

        // get reference to button
        val btn_click_me = findViewById(R.id.button_login) as Button
// set on-click listener
        btn_click_me.setOnClickListener {
//            Toast.makeText(this,"button 1 has been clicked", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, SignupActivity::class.java)
            intent.putExtra("name","johnpeter")
            // start your next activity
            startActivity(intent)
        }




    }
}