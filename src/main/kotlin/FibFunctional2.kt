package fibfunctional2

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
        (0..n).fold(Pair(0,0)) { acc, i ->
            when(i) {
                1 -> Pair(0, 1)
                else -> {
                    val minusTwo = acc.first
                    val minusOne = acc.second
                    Pair(minusOne, minusOne + minusTwo)
                }
            }
        }.second
    }