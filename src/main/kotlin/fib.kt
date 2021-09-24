fun fibRec(n: Int): Int {
    if(n == 0) {
        return 0
    } else if (n == 1) {
        return 1
    } else {
        return fibRec(n-1) + fibRec(n-2)
    }
}

fun fibIter(n: Int) : Int {
    var stack = mutableListOf<Int>()
    stack.add(n)
    var sum = 0

    while (stack.isNotEmpty()) {
        var x = stack.removeLast()
        if (x == 0) {
            sum +=0
        } else if (x == 1) {
            sum +=1
        } else {
            stack.add(x-1)
            stack.add(x-2)
        }

    }
    return sum

}
fun main() {
    println(fibRec(10))
    println(fibIter(10))
}