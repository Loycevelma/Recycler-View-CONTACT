package com.example.conctact.Repository

import com.example.conctact.ContactApp
import com.example.conctact.Database.ContactDatabase

class ContactRepository {
    var database=ContactDatabase.getDatabase(ContactApp.context)

    suspend fun saveContact(contact:Contact)
    withContext(Depachers.IO)
    database.contactDao().insertContact(contact)


}