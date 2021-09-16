package com.example.ViewModel

import androidx.lifecycle.ViewModel

class ContactViewModel:ViewModel() {
    var contactsRepository = ContactsRepository()
    lateinit var contactLiveData: LiveData<Contact>
    fun getContactById(contactId: Int) {
        contactLiveData = contactsRepository.getContactById(contactId)
    }
    fun saveContact(contact: Contact) {
        viewModelScope.launch {
            contactsRepository.saveContact(contact)
        }
}