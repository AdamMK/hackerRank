import kotlin.math.abs

fun minimumAbsoluteDifference(arr: Array<Int>): Int {

//    =
//    arr.mapIndexed { index, s ->
//        arr.slice(index + 1 until arr.size).map { Pair(s, it) }
//    }.flatten().map { abs(it.first - it.second) }.sorted().first()

    val lista = mutableListOf<Pair<Int,Int>>()

    for (i in 0 until arr.size) {
        val s = arr[i]

        for (j in (i + 1) until arr.size) {
            val p = Pair(s, arr[j])
            lista.add(p)
        }
    }

    print(lista)

    return lista.map { abs(it.first - it.second) }.sorted().first()
}

fun main() {
    minimumAbsoluteDifference(arrayOf(-2,2,4))
}