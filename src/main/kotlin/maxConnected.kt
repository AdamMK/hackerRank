import kotlin.math.max

class Grid(private val grid: Array<Array<Int>>) {

    fun maxConnected(): Int {

        var maxCount = 0
        for (y in grid.indices) {
            for (x in 1 until grid[y].size) {
                maxCount = max(maxCount, traverse(x, y, mutableMapOf()))
            }
        }
        return maxCount
    }

    fun traverse(x: Int, y: Int, seen: MutableMap<Pair<Int, Int>, Boolean>): Int {
        val key = Pair(x,y)
        if (key in seen) {
            return 0
        }
        seen[key] = true
        var result = 1
        for (neighbour in neighbours(x, y)) {
            result += traverse(neighbour.first, neighbour.second, seen)
        }
        return result
    }

//    fun traverseIter(x:Int, y: Int, seen : MutableMap<Pair<Int, Int>, Boolean>): Int {
//        val stack = ArrayDeque<Pair<Int, Int>>()
//        stack.addFirst(Pair(x,y))
//        var result = 0
//        while (stack.isNotEmpty()) {
//            val (f,s) = stack.removeLast()
//            val key = Pair(f,s)
//            if (key in seen) {
//                continue
//            }
//            seen[key] = true
//            result += 1
//            for (neighbour in neighbours(x,y)) {
//                stack.addLast(neighbour)
//            }
//        }
//        return result
//    }

    fun colorAt(x: Int, y: Int): Pair<Int,Int> {
        if (x >= 0 && x < grid[0].size && y >= 0 && y < grid.size) {
            return Pair(x,y)
        } else {
            return Pair(-1,-1)
        }

    }


    fun neighbours(x: Int, y: Int): MutableList<Pair<Int, Int>> {
        val positions = arrayOf(Pair(-1, 0), Pair(0, -1), Pair(0, 1), Pair(1, 0))
        val n = mutableListOf<Pair<Int, Int>>()
        for (pos in positions) {
            if (colorAt((x + pos.first), (y + pos.second)) == colorAt(x, y)) {
                n.add(Pair(x + pos.first, y + pos.second))
            }
        }
        return n
    }

}

fun main() {

    val grid = Grid(arrayOf(
        arrayOf(1,0,0,1),
        arrayOf(1,1,1,0),
        arrayOf(0,1,0,0)
    ))
    //should return 5
    print(grid.maxConnected())
}