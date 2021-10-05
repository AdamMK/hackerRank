fun alternatingCharacters(s: String): Int {
    val list = mutableListOf<Char>()
    var couter = 0
    list.add(s.first())

    for(el in s.substring(1)) {
        if (el == list.last()) {
            couter++
        } else {
            list.add(el)
        }
    }
    return couter
}

fun main() {
    print(alternatingCharacters("AAAA"))
}