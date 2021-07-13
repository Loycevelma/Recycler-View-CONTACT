package com.example.conctact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var  rvContact:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        displayContact()
    }
    fun displayContact(){
        var numbersList= listOf(
            contactClass("Loyce","amondiloyce@gmail.com","0706387923"),
            contactClass("Velma","velma@gmail.com","07567389992"),
            contactClass("Kendy","kendy@gmail.com","0706387923"),
            contactClass("Julie","julie@gmail.com","07632526788"),
            contactClass("Kelly","kelly@gmail.com","074672947999"),
            contactClass("Juvelyne","juvelyne@gmail.com","0707899384"),
            contactClass("Diana","diana@gmail.com","0734673884"),
            contactClass("Billy","Billy@gmail.com","07065672653"),
            contactClass("Cate","cate@gmail.com","07067893423"),
            contactClass("Adhiambo","adhiambo@gmail.com","07563245653"),
            contactClass("Rose","rose@gmail.com","0706387923"),
            contactClass("Linda","linda@gmail.com","0706387923"),
            )
        rvContact=findViewById(R.id.rvContact)
        var numberAdapter=ContactAdapter(numbersList)
        rvContact.layoutManager=LinearLayoutManager(baseContext)
        rvContact.adapter=numberAdapter
    }






}
