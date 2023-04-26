package channel

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel

fun main() = runBlocking {
    val channel = Channel<Int>()
    launch {
        for (x in 1..5) {
            delay(1000L)
            channel.send(x * x)
        }
    }

    repeat(5) { println(channel.receive()) }
    println("Done!")
}