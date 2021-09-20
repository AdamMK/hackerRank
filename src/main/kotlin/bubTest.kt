fun bubble(a: Array<Int>): Array<Int> {

    for (i in a.indices) {
        for (j in 0 until a.size-1) {
            if (a[j] > a[j+1]) {
                swapbub(a, j, j+1)
            }
        }
    }
    print(a.toList())
    return a
}

fun swapbub(ar: Array<Int>, i: Int, j: Int) {

    val remp = ar[i]
    ar[i] = ar[j]
    ar[j] = remp
}

fun main() {
    bubble(arrayOf(4,6,3,88,2,444,55,11223,55,23))
}