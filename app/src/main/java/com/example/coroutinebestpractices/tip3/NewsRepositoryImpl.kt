package com.example.coroutinebestpractices.tip3

import kotlinx.coroutines.flow.Flow

class NewsRepositoryImpl: NewRepository {
    override fun getNews(): Flow<List<News>> {
        TODO("Not yet implemented")
    }

    override suspend fun editNews() {
        TODO("Not yet implemented")
    }
}