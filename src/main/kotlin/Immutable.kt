fun main() {
    val n: Int = 5
    // ERROR
    // n = n + 1
    var m: Int = 5
    m = m + 1

    val list = listOf(n, m)
    // ERROR
    // list.add(7)
    val mList = mutableListOf(n, m)
    mList.add(7)
}