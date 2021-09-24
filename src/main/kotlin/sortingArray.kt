fun bubbleSort(a: Array<Int>): Unit {

    val n = a.size

    var counter = 0
    for (i in 0 until n) {
        for (j in 0 until (n-i-1)) {
            // Swap adjacent elements if they are in decreasing order
            if (a[j] > a[j + 1]) {
                swap(a, j, j + 1)
                counter++
                println(a.toList())

            }
        }
    }
    println("Array is sorted in $counter swaps.")
    println("First Element: ${a[0]}")
    println("Last Element: ${a[n-1]}")

}

fun selectionSort(a: Array<Int>) {
    val n = a.size
    var counter = 0
    for (i in 0 until n) {
        var minIndex = i
        for (j in n-1 downTo i) {
            if (a[minIndex] > a[j]) {
                minIndex = j
            }
        }
        if (i != minIndex) {
            counter++
            swap(a, i, minIndex)
            println(a.toList())
        }
    }

    println("Array is sorted in $counter swaps.")
    println("First Element: ${a[0]}")
    println("Last Element: ${a[n-1]}")
}

//temp array expanding with each iteration by 1 and puts that additional
//element expanded by to the correct place in new array
fun insertionSort(a: Array<Int>) {
    val n = a.size
    var counter = 0
    for (i in 0 until n) {
        val key = a[i]
        var j = i
        while (j > 0 && key < a[j-1]) {
            a[j] = a[j-1]
            j -= 1
        }
        a[j] = key
        counter++
        println(a.toList())
    }

    println("Array is sorted in $counter swaps.")
    println("First Element: ${a[0]}")
    println("Last Element: ${a[n-1]}")
}

fun swap(a: Array<Int>, i: Int, j:Int): Unit {
    if (i == j) return
    val temp = a[i]
    a[i] = a[j]
    a[j] = temp
}

//choose the random element and divide the array based on position of that elment
//all elements smaller then pivot on the left and rest on the right and do it again
fun quickSort(a: List<Int>): List<Int> {
    if (a.count() < 2) {
        return a
    }
    val pivot = a[a.size/2]
    val equal = a.filter { it == pivot }
    val less = a.filter { it < pivot }
    val greater = a.filter { it > pivot }

    return quickSort(less) + equal + quickSort(greater)
}

fun mergeSort(a: List<Int>): List<Int> {
    if (a.count() < 2) {
        return a
    }

    val middle = a.size/2
    val left = a.subList(0,middle)
    val right = a.subList(middle, a.size)

    return merge(mergeSort(left), mergeSort(right))
}

fun merge(left: List<Int>, right: List<Int>): List<Int> {

    var indexLeft = 0
    var indexRight = 0
    val newList: MutableList<Int> = mutableListOf()

    while (indexLeft < left.count() && indexRight < right.count()) {
        if (left[indexLeft] <= right[indexRight]) {
            newList.add(left[indexLeft])
            indexLeft++
        } else {
            newList.add(right[indexRight])
            indexRight++
        }
    }

    while (indexLeft < left.size) {
        newList.add(left[indexLeft])
        indexLeft++
    }

    while (indexRight < right.size) {
        newList.add(right[indexRight])
        indexRight++
    }

    return newList
}

fun main() {
    bubbleSort(arrayOf(6,4,1,2,3))
    println("----------------------------")
    selectionSort(arrayOf(6,4,1,2,3))
    println("----------------------------")
    insertionSort(arrayOf(6,4,1,2,3))
    println("----------------------------")
    println(quickSort(listOf(6,4,1,2,3)))
    println("----------------------------")
    println(mergeSort(listOf(6,4,1,2,3)))
}