

fun <T : Any> countFreq  (bigA: Array<T>): MutableMap<T, Int> {

    val res = mutableMapOf<T, Int>()

    for (element in bigA) {
        res.compute(element){ _, value -> if (value == null) 1 else value + 1}
    }

    //why is it only printing number but not other objects
    print(res)
    return res
}

fun main() {
    countFreq(arrayOf(2,4,"sd",6,3,4,5,6,6, "4", "sd"))
}