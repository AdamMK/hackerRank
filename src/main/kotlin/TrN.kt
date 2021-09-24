import kotlin.collections.ArrayDeque

class TrN(val value: Int, val ch : Array<TrN> = arrayOf()) {


    fun dfs() {
        print("${this.value} ")
        for (child in ch) {
            child.dfs()
        }
    }

    fun postorder() {
        for (child in ch) {
            child.postorder()
        }
        print("${this.value} ")
    }

    fun bfs() {
        val queue = ArrayDeque<TrN>()
        queue.add(this)
        while (queue.isNotEmpty()) {
            val node = queue.removeFirst()
            print("${node.value} ")
            for (child in node.ch) {
                queue.add(child)
            }
        }

    }
}

fun main() {

    val node = TrN(1, arrayOf(TrN(2, arrayOf(TrN(4), TrN(5))), TrN(3, arrayOf(TrN(6)))) )

    //dfs - preorder 1 2 4 5 3 6
    //node.dfs()

    //dfs - 4 5 2 6 3 1
    //node.postorder()

    //bfs - 1 2 3 4 5 6
    node.bfs()
}