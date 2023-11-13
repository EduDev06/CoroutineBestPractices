package com.example.coroutinebestpractices.tip4

import kotlinx.coroutines.flow.Flow

interface BooksRepository {
    fun fetchBooks(): Flow<Books>
}