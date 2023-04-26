package fibexceptions

fun main() {
    try {
        val fib = fib(15)
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
        when (n) {
            0 -> 0
            1 -> 1
            else -> fib(n-1) + fib(n-2)
        }
    }