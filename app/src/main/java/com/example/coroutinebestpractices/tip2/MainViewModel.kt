package com.example.coroutinebestpractices.tip2

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.coroutinebestpractices.tip1.GetContactsUseCase
import kotlinx.coroutines.launch

class MainViewModel(
    private val getContactsUseCase: GetContactsUseCase
): ViewModel() {

    // Don't
    //suspend fun getContacts() = getContactsUseCase()

    // Do
    private fun getContacts() {
        viewModelScope.launch {
            val contacts = getContactsUseCase()
        }
    }
}