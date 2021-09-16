package com.example.conctact.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.conctact.ContactAdapter
import com.example.conctact.R
import com.example.conctact.models.contactClass

class MainActivity : AppCompatActivity() {
    lateinit var  rvContact:RecyclerView
val contactViewModel:ContactsViewModel
val ConytactVoiewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        displayContact()
    }

    override fun onResume() {
        super.onResume()
        contactViewModel.contactLiuveData
    }


    fun displayContact(contactList:List<Contact>){

        rvContact=findViewById(R.id.rvContact)
        rvContact.layoutManager=LinearLayoutManager(baseContext)
        var numberAdapter= ContactAdapter(numbersList,baseContext)
        rvContact.adapter=numberAdapter
    }

    fun validateContact(){
        binding.tilName.error=null
        binding.tilPhoneNumber.error=null
        binding.tilEmail.error=null
        var name=binding.etName.text.toString()
        var phone=binding.etPhoneNumber.text.toString()
        var email=binding.etemail.text.toString()
        error=false



        if (phone.isEmpty()||phone.isBlank()){
            error=true
            binding.tilName.error=context.getString(R.string.phone_required)

        }
        if (phone.isEmpty()||name.isBlank()){
            error=true
            binding.tilName.error="Name"

        }
        if (phone.isEmpty()||email.isBlank()){
            error=true
            binding.tilEmail.error="Email"

        }
        if (!error())
            var contact=Contact(0,name.phone,email,"")
        ContactViewModel.saveContact(contact)
        binding.etName.text=("")
        binding.etPhoneNumber.text=("")
        binding.etEmail.text=("")


    }






}
