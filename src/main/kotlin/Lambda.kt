fun main() {
    val add = {a: Int, b: Int ->
        a + b
    }

    val result = add(12, 40)
    println(result)

    val nums = listOf(1,2,3,4,5)
    val result2 = nums.map { it*2 }
    println(result2)
}