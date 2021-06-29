fun birthdayCakeCandles(candles: Array<Int>): Int {
    val maxElement = candles.sorted().last()
    return candles.count { it == maxElement }
    }
fun main(args: Array<String>) {

    val candles = arrayOf(1,3,4,5,5,5,5,5)

    val result = birthdayCakeCandles(candles)

    println(result)
}
