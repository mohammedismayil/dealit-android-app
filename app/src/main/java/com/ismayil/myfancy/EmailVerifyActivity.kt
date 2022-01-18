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


import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
class EmailVerifyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email_verify)





//        val intent = Intent(this, DisplayMessageActivity::class.java)
//        val bundle: Bundle? = intent.extras
//        val name: String? = bundle?.getString("email")
//        Log.d("DisplayMessageActivity", "Got email from first activity$name")
//        emailTV.setText("passedEmail");
//        emailTV.setText(name);
        // getting the recyclerview by its id
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<ItemsViewModel>()

        // This loop will create 20 Views containing
        // the image with the count of view
        for (i in 1..20) {
            data.add(ItemsViewModel(R.drawable.ic_baseline_folder_24, "Item " + i))
        }

        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter

    }
}