class LinkedListNode<T>(var value: T, var next : LinkedListNode<T>? = null ) {

    override fun toString(): String {
        return if (next != null) {
            "$value -> ${next.toString()}"
        } else {
            "$value"
        }
    }
}

class LinkedList<T> {

    private var head: LinkedListNode<T>? = null
    private var tail: LinkedListNode<T>? = null
    private var size = 0

    fun isEmpty(): Boolean {
        return size == 0
    }

    override fun toString(): String {
        if (isEmpty()) {
            return "Empty list"
        } else {
            return head.toString()
        }
    }

    //insert Node at the Head
    fun push(value: T): LinkedList<T> {
        head = LinkedListNode(value = value, next = head)
        if (tail == null) {
            tail = head
        }
        size++
        return this
    }
}

fun main() {

    val list = LinkedList<Int>()



    val node1 = LinkedListNode(value = 1)
    val node2 = LinkedListNode(value = 2)
    val node3 = LinkedListNode(value = 3)

    node1.next = node2
    node2.next = node3

    list.push(55).push(444)
    list.push(11)

    println(node1)

    println(list)
}