package com.example.coroutinebestpractices.tip1

import com.example.coroutinebestpractices.Contacts
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ContactsRepositoryImpl(
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
): ContactsRepository {

    // Don't
    /*
    override suspend fun getContacts(): List<Contacts> {
        return withContext(Dispatchers.IO) { emptyList() }
    }

     */

    // Do
    override suspend fun getContacts(): List<Contacts> {
        return withContext(ioDispatcher) { emptyList() }
    }
}