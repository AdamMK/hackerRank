fun countSwaps(a: Array<Int>): Unit {

    var counter = 0
    for (i in 0 until (a.size)) {
        for (j in 0 until (a.size-1)) {
            // Swap adjacent elements if they are in decreasing order
            if (a[j] > a[j + 1]) {
                swap(a, j, j + 1)
                counter++

            }
        }
    }
    println("Array is sorted in $counter swaps.")
    println("First Element: ${a[0]}")
    println("Last Element: ${a[a.size-1]}")

}

fun swap(a: Array<Int>, i: Int, j:Int): Unit {

    if (i == j) return

    val temp = a[i]
    a[i] = a[j]
    a[j] = temp

}

fun main() {
    countSwaps(arrayOf(6,4,1))
}