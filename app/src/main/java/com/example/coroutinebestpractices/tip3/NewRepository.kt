package com.example.coroutinebestpractices.tip3

import kotlinx.coroutines.flow.Flow

interface NewRepository {
    fun getNews(): Flow<List<News>>

    suspend fun editNews()
}