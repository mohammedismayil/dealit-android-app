package com.ismayil.myfancy

import android.R.attr
import android.R.attr.*
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.squareup.picasso.Picasso;
//import android.R
import android.widget.ImageView
import android.widget.TextView
import android.content.Intent





class DisplayMessageActivity : AppCompatActivity() {
    lateinit var emailTV: EditText
    lateinit var passwordTV: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message);

initViews()
    }







    fun initViews(){
        val btn_click_me = findViewById<Button>(R.id.submitButton)
        emailTV = findViewById(R.id.emailTV)
        passwordTV = findViewById(R.id.passwordTV)
        btn_click_me.setOnClickListener {
            Log.d("DisplayMessageActivity", "next button tapped")
            Log.d("DisplayMessageActivity", emailTV.text.toString())
            val intent = Intent(applicationContext, EmailVerifyActivity::class.java)
            intent.putExtra("email",emailTV.text.toString())
            startActivity(intent);
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("DisplayMessageActivity", "onStart called")
    }

    override fun onResume() {


        super.onResume()
        Log.d("DisplayMessageActivity", "onResume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("DisplayMessageActivity", "onPause called")
    }
    override fun onStop() {
        super.onStop()
        Log.d("DisplayMessageActivity", "onStop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("DisplayMessageActivity", "onDestroy called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("DisplayMessageActivity", "onRestart called")
    }
}