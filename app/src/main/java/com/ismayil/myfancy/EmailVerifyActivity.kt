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
class EmailVerifyActivity : AppCompatActivity() {
    lateinit var emailTV: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email_verify)
         emailTV = findViewById(R.id.passedEmailTV)




//        val intent = Intent(this, DisplayMessageActivity::class.java)
        val bundle: Bundle? = intent.extras
        val name: String? = bundle?.getString("email")
        Log.d("DisplayMessageActivity", "Got email from first activity$name")
        emailTV.setText("passedEmail");
        emailTV.setText(name);
    }
}