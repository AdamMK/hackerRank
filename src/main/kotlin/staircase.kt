fun printStaircase(n: Int) {
    for (i in 1..n) {
        println(" ".repeat(n-i)+"#".repeat(i))
    }
}

fun main() {
    printStaircase(5)
}
