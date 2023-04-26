package fibjava

import java.util.Scanner
fun main() {
    try {
        val scanner = Scanner(System.`in`)
        val fib = fib(scanner.nextInt())
        println("Fibonacci number 15: $fib")
    } catch (e: NegativeNumberException) {
        println("Number was negative")
    }
}

class NegativeNumberException : RuntimeException("Negative number detected")

fun fib(n: Int): Int =
    if(n < 0) {
        throw NegativeNumberException()
    } else {
        var a = 0
        var b = 0
        for(i in 0..n) {
            if(i == 1) {
                a = 0
                b = 1
            } else {
                val sum = a + b
                a = b
                b = sum
            }
        }
        b
    }