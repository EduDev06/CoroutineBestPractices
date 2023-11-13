package com.example.coroutinebestpractices.tip1

import com.example.coroutinebestpractices.Contacts
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ContactsRepositoryImpl: ContactsRepository {

    // Don't
    override suspend fun getContacts(): List<Contacts> {
        return withContext(Dispatchers.IO) { emptyList() }
    }
}