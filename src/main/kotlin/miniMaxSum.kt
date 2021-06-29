import java.lang.Integer.sum

fun miniMaxSum(arr: Array<Int>){
    var minSum = arr.sorted().dropLast(1).map { it.toLong() }.sum()
    var maxSum = arr.sorted().drop(1).map { it.toLong() }.sum()
    print("$minSum $maxSum")

}

fun main() {
    miniMaxSum(arrayOf(1,2,3,4,5))
}
