import kotlin.jvm.Throws

// when the all children node of the binary tree on the right are smaller
//than their parents and all children on the right are greater then their parents
// time complexity 0(log2(n)), space 0(n)
class BinarySearchTreeNode(
    val value: Int,
    val left: BinarySearchTreeNode? = null,
    val right: BinarySearchTreeNode? = null
) {

    override fun toString(): String = when {
        left != null && right != null -> "$value ->[ $left ,  $right ]"
        left != null -> "$value ->[ $left, null ]"
        right != null -> "$value ->[ null, $right ]"
        else -> "$value"
    }

    //should always print from smallest to biggest
    fun inorder(): Array<Int> {
        val a = left?.inorder() ?: emptyArray()
        val b = right?.inorder() ?: emptyArray()
        return a + arrayOf(this.value) + b
    }

    fun preorder(): Array<Int> {
        val a = left?.preorder() ?: emptyArray()
        val b = right?.preorder() ?: emptyArray()
        return arrayOf(this.value) + a + b
    }

    fun postorder(): Array<Int> {
        val a = left?.postorder() ?: emptyArray()
        val b = right?.postorder() ?: emptyArray()
        return  a + b + arrayOf(this.value)
    }

    fun search(key : Int): BinarySearchTreeNode? = when {
        this.value > key -> left?.search(key)
        this.value < key -> right?.search(key)
        else -> this
    }

}

fun main() {

    val tNode = BinarySearchTreeNode(
        4, BinarySearchTreeNode(2, BinarySearchTreeNode(1), BinarySearchTreeNode(3)),
                BinarySearchTreeNode(6, null, BinarySearchTreeNode(7)))

    println(tNode.inorder().toList())
    println(tNode.preorder().toList())
    println(tNode.postorder().toList())
    println(tNode.search(45).toString())

}