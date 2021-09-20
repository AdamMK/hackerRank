//data class Suits(
//    val sp : String,
//    val hr: String,
//    val cl: String,
//    val dm: String
//        )
//

fun cards(sample: Array<Pair<String, Int>>, firstPair: Pair<String, Int>): Int {

    val allDeck = arrayOf("H" to 1 , "S" to 1 , "D" to 1 , "C" to 1 ,
                          "H" to 2 , "S" to 2 , "D" to 2 , "C" to 2 ,
                          "H" to 3 , "S" to 3 , "D" to 3 , "C" to 3 ,
                          "H" to 4 , "S" to 4 , "D" to 4 , "C" to 4 ,
                          "H" to 5 , "S" to 5 , "D" to 5 , "C" to 5 ,
                          "H" to 6 , "S" to 6 , "D" to 6 , "C" to 6 ,
                          "H" to 7 , "S" to 7 , "D" to 7 , "C" to 7 ,
                          "H" to 8 , "S" to 8 , "D" to 8 , "C" to 8 ,
                          "H" to 9 , "S" to 9 , "D" to 9 , "C" to 9 ,
                          "H" to 10, "S" to 10, "D" to 10, "C" to 10,
                          "H" to 11, "S" to 11, "D" to 11, "C" to 11,
                          "H" to 12, "S" to 12, "D" to 12, "C" to 12,
                          "H" to 13, "S" to 13, "D" to 13, "C" to 13
    )

    sample.forEach { if (it !in allDeck) {
        print("One or more cars not in the possible deck")
        return 0
    } }


    val outputCards = mutableListOf<Pair<String, Int>>()

    outputCards.add(firstPair)

    sample.forEach { if(it.first == outputCards.last().first || it.second == outputCards.last().second) outputCards.add(it) }
    outputCards.toSet()

    println(outputCards)

    return outputCards.count()
}

fun main() {
    cards(arrayOf("H" to 3, "H" to 4, "D" to 5, "D" to 1, "S" to 4, "D" to 7, "H" to 12, "D" to 12, "S" to 12, "H" to 12), "H" to 12)
}