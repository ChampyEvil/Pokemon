package com.champyevil.pokemon

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val job = GlobalScope.launch(start = CoroutineStart.LAZY) {
        println("Hello")
    }

    job.start()
    println("World")
}