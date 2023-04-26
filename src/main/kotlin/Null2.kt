fun main() {
    val msg1 = "Hola"
    val msg2 = "Adios"
    val msg3 = null

    val list = listOf(msg1, msg2, msg3)

    list.forEach {
        val n = stringLength(it)
        println(10 + (n ?: 0))
    }
}

fun stringLength(str: String?): Int? =
    if(str != null) {
        str.length
    } else {
        null
    }

fun stringLength2(str: String?): Int? =
    str?.length

fun stringLength3(str: String?): Int? =
    str?.let {
        println("Doing stuff!")
        it.length
    }