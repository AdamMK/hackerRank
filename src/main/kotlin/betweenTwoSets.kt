fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    var count = 0
    for (i in 1..100) {
        if (a.all { i%it == 0 }) {
            if (b.all { it%i == 0  }){
                count++
            }
        }
    }
    return count
}





