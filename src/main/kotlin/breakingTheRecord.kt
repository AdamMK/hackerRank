fun breakingRecords(scores: Array<Int>): Array<Int> {

    var highBreak = 0
    var lowBreak = 0
    var firstScore = scores[0]

    for (i in scores.indices) {
        if (scores[i] > firstScore) {
            highBreak++
            firstScore = scores[i]
        }
    }

    firstScore = scores[0]
    for (i in scores.indices) {
        if (scores[i] < firstScore) {
            lowBreak++
            firstScore = scores[i]
        }
    }
    println(arrayOf(highBreak, lowBreak).toList())
    return arrayOf(highBreak, lowBreak)
}

fun main() {
    breakingRecords(arrayOf(3,4,21,36, 10, 28, 35, 5, 24, 42, 1))
}
