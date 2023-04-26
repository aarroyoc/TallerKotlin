package coroutines1

import kotlinx.coroutines.*

fun main() = runBlocking {
    launch {
        doSomething()
    }
    println("HELLO")
}

suspend fun doSomething() {
    delay(1000L)
    println("World")
}