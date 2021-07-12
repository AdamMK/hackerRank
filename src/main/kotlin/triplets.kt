// Complete the compareTriplets function below.
fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {

//___________________________________________________
//    val zipped: List<Pair<Int, Int>> = a.zip(b)
//
//    val scores: List<Pair<Int, Int>> = zipped.map { (first, second) ->
//        when {
//            (first == second) -> 0 to 0
//            (first > second) -> 1 to 0
//            else -> 0 to 1
//        }
//    }
//
//    val unzipped: Pair<List<Int>, List<Int>> = scores.unzip()
//
//    return arrayOf(unzipped.first.sum(), unzipped.second.sum())
//___________________________________________________

//    val zipped: List<Pair<Int, Int>> = a.zip(b)
//    //[(1,3),(3,5),(55,3)]
//    val scores = zipped.fold(Pair(0, 0), { (sumLeft, sumRight), (left, right) ->
//        when {
//            (left == right) -> Pair(sumLeft, sumRight)
//            (left > right) -> Pair(sumLeft + 1, sumRight)
//            else -> Pair(sumLeft, sumRight + 1)
//        }
//    })
//
//    return arrayOf(scores.first, scores.second)
//___________________________________________________

//remember to always return from Lambda!!!!
    val zipped: List<Pair<Int, Int>> = a.zip(b)
    val scores: Array<Int> = zipped.fold(arrayOf(0,0), { sum : Array<Int>, (left, right) ->
        when {
           (left > right) -> sum[0] += 1
           (left < right) ->  sum[1] += 1
        }
        sum
    })

    return scores
}

//fun main(args: Array<String>) {
//    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
//
//    val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
//
//    val result = compareTriplets(a, b)
//
//    println(result.joinToString(" "))
//}
