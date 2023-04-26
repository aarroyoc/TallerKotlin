package coroutines2

import kotlinx.coroutines.*

fun main() = runBlocking {
    println("START")
    val a = async {
        doSomething1()
    }
    val b = async {
        doSomething2()
    }
    val nums = awaitAll(a, b)
    println(nums.sum())
}

suspend fun doSomething1(): Int {
    delay(5000L)
    return 50
}

suspend fun doSomething2(): Int {
    delay(5000L)
    return 100
}