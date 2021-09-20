fun maximumToys(prices: Array<Int>, k: Int): Int {

    if (prices.isEmpty()) return 0

    var toysCount = 0
    var currentTotal = 0

    // not optimal sort
//    for(price in prices.indices) {
//        for (j in 0 until (prices.size-1)) {
//            if (prices[j] > prices[j+1]) {
//                swapA(prices,j, j+1)
//            }
//        }
//    }
//    println(prices.toList())
    for (i in prices.sorted()) {
        currentTotal+=i
        if (currentTotal >= k ) return toysCount else {
            toysCount++
        }
    }
    return toysCount
}

//fun swapA(p: Array<Int>, i: Int, j:Int): Unit {
//
//    val temp = p[i]
//    p[i] = p[j]
//    p[j] = temp
//}

fun main() {
    print(maximumToys(arrayOf(1,12,5,111,200,1000,10), 50))
}
