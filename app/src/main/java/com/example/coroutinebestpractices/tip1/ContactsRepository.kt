package com.example.coroutinebestpractices.tip1

import com.example.coroutinebestpractices.Contacts

interface ContactsRepository {

    suspend fun getContacts(): List<Contacts>
}