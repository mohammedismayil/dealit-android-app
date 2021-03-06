package com.ismayil.myfancy

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import com.ismayil.myfancy.databinding.ActivityMainBinding
import android.graphics.Bitmap

import android.graphics.BitmapFactory

import android.os.AsyncTask
import java.lang.Exception
import java.net.URL


import android.content.Intent

import android.view.View
import android.widget.EditText
class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("myTag", "onCreate called")
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        setSupportActionBar(binding.appBarMain.toolbar)
//
//        binding.appBarMain.fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                    .setAction("Action", null).show()
//        }
//        val drawerLayout: DrawerLayout = binding.drawerLayout
//        val navView: NavigationView = binding.navView
//        val navController = findNavController(R.id.nav_host_fragment_content_main)
//        // Passing each menu ID as a set of Ids because each
//        // menu should be considered as top level destinations.
//        appBarConfiguration = AppBarConfiguration(setOf(
//                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow), drawerLayout)
//        setupActionBarWithNavController(navController, appBarConfiguration)
//        navView.setupWithNavController(navController)
        setContentView(R.layout.another_main_activity)

        val button: Button = findViewById(R.id.main_button)
        button.text = "Created"

        button.setOnClickListener {
            Log.d("sample","clicking this damn button again")

            val intent = Intent(this, DisplayMessageActivity::class.java).apply {
                putExtra("EXTRA_MESSAGE", "hi there")
            }
            startActivity(intent)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }


    override fun onStart() {
        super.onStart()
        Log.d("myTag", "onStart called")
    }

    override fun onResume() {
        Log.d("myTag", "onResume called")

        super.onResume()
        val button: Button = findViewById(R.id.main_button)
        button.text = "Resume"
    }

    override fun onPause() {
        super.onPause()
        Log.d("myTag", "onPause called")
    }
    override fun onStop() {
        super.onStop()
        Log.d("myTag", "onStop called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("myTag", "onDestroy called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("myTag", "onRestart called")
    }
    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }


}
