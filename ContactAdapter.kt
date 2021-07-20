package com.example.conctact

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ContactAdapter(var ContactList:List<contactClass>,var context:Context):RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var itemsView=LayoutInflater.from(parent.context)
            .inflate(R.layout.contact,parent,false)
        return ContactViewHolder(itemsView)


    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact=ContactList.get(position)
        holder.tvName.text=currentContact.Name
        holder.tvEmail.text=currentContact.Email
        holder.tvContact.text=currentContact.Contact

        holder.cvContact.setOnClickListener{
            val intent=Intent(context,ContactDetailsActivity::class.java)
            intent.putExtra("Name",currentContact.Name)
            intent.putExtra("Email",currentContact.Email)
            intent.putExtra("Contact",currentContact.Contact)
            intent.putExtra("image",currentContact.imageUrl)
            context.startActivity(intent)



        }
        Picasso.get()
            .load(currentContact.imageUrl)
            .resize(80,80)
            .centerCrop()
            .into(holder.ivContacts)


    }
    override fun getItemCount(): Int {
        return ContactList.size
    }
}
class ContactViewHolder(itemsView:View):RecyclerView.ViewHolder(itemsView){
    var tvName=itemsView.findViewById<TextView>(R.id.tvName)
    var tvEmail=itemsView.findViewById<TextView>(R.id.tvEmail)
    var tvContact=itemsView.findViewById<TextView>(R.id.tvPhone)
    var ivContacts=itemsView.findViewById<ImageView>(R.id.ivContacts)
    var cvContact=itemsView.findViewById<CardView>(R.id.cvContact)



}