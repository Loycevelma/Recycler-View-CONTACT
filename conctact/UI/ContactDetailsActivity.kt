package com.example.conctact.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.conctact.R
import com.squareup.picasso.Picasso

class ContactDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_details)

        var NameIntent=intent.getStringExtra("Name")
        var EmailIntent=intent.getStringExtra("Email")
        var ContactIntent=intent.getStringExtra("Contact")
        var imageUrlIntent=intent.getStringExtra("imageUrl").toString()


        var Name=findViewById<TextView>(R.id.tvName1)
        var Email=findViewById<TextView>(R.id.tvEmail1)
        var Contact=findViewById<TextView>(R.id.tvContact1)
        var imageUrl=findViewById<ImageView>(R.id.ivDetails)
        


        Name.text=NameIntent
        Email.text=EmailIntent
        Contact.text=ContactIntent
       Picasso.get()
           .load(imageUrlIntent)
           .into(imageUrl)

    }
}