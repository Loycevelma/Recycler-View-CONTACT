package com.example.conctact.models

@Entity(tableName="Contacts")
data class contactClass(
    var contactId:Int,
    var Name:String,
    var Email:String,
    var Contact:String,
    var imageUrl:String,
)
