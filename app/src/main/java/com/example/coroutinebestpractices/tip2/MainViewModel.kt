package com.example.coroutinebestpractices.tip2

import com.example.coroutinebestpractices.tip1.GetContactsUseCase

class MainViewModel(
    private val getContactsUseCase: GetContactsUseCase
) {

    // Don't
    suspend fun getContacts() = getContactsUseCase()
}