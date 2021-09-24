
fun ser(list: List<Int>, low: Int, high: Int, el : Int): Int? {
    if (low > high) return null
    val mid = (low+high)/2
    if (list[mid] == el) {
        return mid
    }
    if (list[mid] > el){
        return ser(list, low, mid-1, el)
    } else {
        return ser(list, mid+1, high, el)
    }
}
fun main() {

    val nums = listOf(1,2,3,4,6,7,8,26)
    println(ser(nums, 0,nums.size-1, 5))
}