package com.example.conctact.Database

import androidx.lifecycle.LiveData

@Dao
interface ContactDao {
    interface ContactDao {
        @Insert(onConflict = OnConflictStrategy.REPLACE)
        fun insertContact(contact: Contact)
        @Query("SELECT * FROM Contacts")
        fun getAllContacts(): LiveData<List<Contact>>
        @Query("SELECT * FROM Contacts WHERE contactId = :contactId")
        fun getContactById(contactId: Int): LiveData<Contact>
    }
}