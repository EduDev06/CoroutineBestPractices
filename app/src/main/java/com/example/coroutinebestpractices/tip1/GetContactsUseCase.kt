package com.example.coroutinebestpractices.tip1

import com.example.coroutinebestpractices.Contacts

class GetContactsUseCase(
    private val contactsRepository: ContactsRepository
) {
    suspend operator fun invoke(): List<Contacts> {
        return contactsRepository.getContacts()
    }
}