
fun find(root: BinarySearchTreeNode, key : Int): BinarySearchTreeNode? = when {
    key == root.value -> root
    key > root.value && root.right != null -> find(root.right, key)
    key < root.value && root.left != null -> find(root.left, key)
    else -> null
}

fun main() {
    val tNode = BinarySearchTreeNode(
        4, BinarySearchTreeNode(2, BinarySearchTreeNode(1), BinarySearchTreeNode(3)),
        BinarySearchTreeNode(6))

    println(find(tNode, 2))
}