fun angryProfessor(k: Int, a: Array<Int>): String = if (k > a.filter { it <= 0 }.count() || k<2) "YES" else "NO"

fun main() {
    println(angryProfessor(3, arrayOf(-1, -3, 4, 2)))
    println(angryProfessor(2, arrayOf(0, -1, 2, 1)))
    println(angryProfessor(1, arrayOf(0, -1, 2, 1)))
}