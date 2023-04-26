fun main() {
    var list: NodeList? = NodeList(
        value = "hola",
        next = NodeList("gente", NodeList("de", NodeList("GDG", null)))
    )

    while(list != null) {
        print("${list.value}")
        list = list.next
    }
}

class NodeList(value: String, next: NodeList?) {
    val value = value
    val next = next
}