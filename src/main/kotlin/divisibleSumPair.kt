fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {

    val list = mutableListOf<Pair<Int,Int>>()

    ar.indices.forEach {
        i -> ar.indices.minus(0..i).forEach {
            j -> list.add(i to j)
        }
    }

    return list.count { (ar[it.first]+ar[it.second])%k == 0 }
}

fun main() {
    print(divisibleSumPairs(6,3, arrayOf(1, 3, 2, 6, 1, 2)))
}