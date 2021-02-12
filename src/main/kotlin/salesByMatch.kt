import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

// Complete the sockMerchant function below.
fun sockMerchant(n: Int, ar: Array<Int>): Int {

  var pairCounter = 0
  val noPairYet = mutableSetOf<Int>()

    for (i in 0 until n) {
        if (!noPairYet.contains(ar[i])) {
            noPairYet.add(ar[i])
        } else {
            pairCounter++
            noPairYet.remove(ar[i])
        }
    }

return pairCounter
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}
