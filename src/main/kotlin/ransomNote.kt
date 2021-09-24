
fun checkMagazine(magazine: Array<String>, note: Array<String>): Unit {

    val magMap = mutableMapOf<String, Int>()
    var check = true

    for (word in magazine) {
        magMap.compute(word) { _, v -> if (v == null) 1 else v + 1 }
    }

    for (word in note) {
        if (!magMap.containsKey(word) || magMap[word] == 0) {
            check = false
        }
        magMap.computeIfPresent(word) {_,v -> v-1}
    }
    if (check) print("Yes") else print("No")
}

fun main() {
    checkMagazine(arrayOf("two", "times", "three", "is", "not", "four"), arrayOf("two", "times", "two", "is", "four"))
}