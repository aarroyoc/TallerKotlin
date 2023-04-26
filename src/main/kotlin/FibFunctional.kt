package fibfunctional

fun main() {
    val fib = fib(15)
    println("Fibonacci number 15: $fib")
}

fun fib(n: Int): Int =
    when(n) {
        0 -> 0
        1 -> 1
        else -> fib(n-1) + fib(n-2)
    }