package com.example.conctact

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter(var ContactList:List<contactClass>):RecyclerView.Adapter<ContactViewHolder>(){
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


    }

    override fun getItemCount(): Int {
        return ContactList.size
    }
}


class ContactViewHolder(itemsView:View):RecyclerView.ViewHolder(itemsView){
    var tvName=itemsView.findViewById<TextView>(R.id.tvName)
    var tvEmail=itemsView.findViewById<TextView>(R.id.tvEmail)
    var tvContact=itemsView.findViewById<TextView>(R.id.tvPhone)


}