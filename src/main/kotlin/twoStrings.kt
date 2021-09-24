fun twoStrings(s1: String, s2: String): String {

    //not optimal for a very long strings
    //if (s1.filter { it in s2 }.count() == 0) "NO" else "YES"

    for ( c in "abcdefghijklmnopqrstuvwxyz") {
        if (s1.indexOf(c) > -1 && s2.indexOf(c) > -1) {
            return "YES"
        }
    }
    return "NO"
}

fun main() {
    print(twoStrings("aarrgtjjssb", "bb"))
}