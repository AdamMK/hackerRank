class BinaryTreeNode(var nodeValue: Int, var left : BinaryTreeNode? = null, var right : BinaryTreeNode? = null) {

    override fun toString(): String {
        return if (left != null && right != null) {
            "$nodeValue [ <$left ,  $right ]"
        } else if (left != null) {
            "$nodeValue [ <$left ]"
        } else if (right != null) {
            "$nodeValue [ $right ]"
        } else {
            "$nodeValue"
        }
    }

    fun find(value : Int): BinaryTreeNode? = when {
        this.nodeValue > value -> left?.find(value)
        this.nodeValue < value -> right?.find(value)
        else -> this
    }

    //left > parent > right
    fun visitInOrder() : Array<Int> {
        val a = left?.visitInOrder() ?: emptyArray()
        val b = right?.visitInOrder() ?: emptyArray()
        return a + arrayOf(nodeValue) + b
    }

    //parent > left > right
    fun visitPreOrder() : Array<Int> {
        val a = left?.visitPreOrder() ?: emptyArray()
        val b = right?.visitPreOrder() ?: emptyArray()
        return arrayOf(nodeValue) + a + b
    }

    // left > right > parent
    fun visitPostOrder() : Array<Int> {
        val a = left?.visitPostOrder() ?: emptyArray()
        val b = right?.visitPostOrder() ?: emptyArray()
        return  a + b + arrayOf(nodeValue)
    }

    fun insertNode(value : Int) {
        if (value > this.nodeValue) {
            if (this.right == null) {
                this.right = BinaryTreeNode(value)
            } else {
                this.right?.insertNode(value)
            }
        } else if (value < this.nodeValue) {
            if (this.left == null) {
                this.left = BinaryTreeNode(value)
            } else {
                this.left?.insertNode(value)
            }
        }
    }
}


fun main() {

    val b = BinaryTreeNode(10,
        BinaryTreeNode(2, BinaryTreeNode(1), BinaryTreeNode(5)),
        BinaryTreeNode(12, null, BinaryTreeNode(14)))

    //      10
    //     /  \
    //    2    12
    //   / \     \
    //  1   5     14

    println(b)

    println(b.find(14))


    println(b.visitInOrder().toList())

    println(b.visitPreOrder().toList())

    println(b.visitPostOrder().toList())

    b.insertNode(13)


}