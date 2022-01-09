package com.ismayil.myfancy

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.squareup.picasso.Picasso;
//import android.R
import android.widget.ImageView


class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        val imageView: ImageView = findViewById(R.id.imageView3)

//        Picasso.get().load("https://media.geeksforgeeks.org/wp-content/cdn-uploads/logo-new-2.svg").into(imageView)

        Picasso.get().load("http://i.imgur.com/DvpvklR.png").into(imageView);

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