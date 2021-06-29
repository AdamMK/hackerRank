fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Pair<Int,Int> {
    //apples only on the right of the tree (positive value)
    val noOfApples = apples.filter{it>0&&(it+a)>=s&&(it+a)<=t}.count()
    //oranges only on the left from the tree (negative value)
    val noOfOranges = oranges.filter{it<0&&(b+it)<=t&&(b+it)>=s}.count()
    return Pair(noOfApples,noOfOranges)

}
