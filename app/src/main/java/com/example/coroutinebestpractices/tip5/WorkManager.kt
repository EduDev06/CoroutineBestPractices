package com.example.coroutinebestpractices.tip5

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch

fun main() {
    val workManager = WorkManager()
    workManager.doWork1()
    workManager.doWork2()
    workManager.cancelAllWork()
    workManager.doWork1()
}

class WorkManager {
    private val job = SupervisorJob()
    private val scope = CoroutineScope(Dispatchers.Default + job)

    fun doWork1() {
        scope.launch { println("Work1") }
    }

    fun doWork2() {
        scope.launch { println("Work2") }
    }

    fun cancelAllWork() {
        job.cancel()
    }
}