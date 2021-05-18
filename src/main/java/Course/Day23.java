package Course;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node3 {
    Node3 left, right;
    int data;

    Node3(int data) {
        this.data = data;
        left = right = null;
    }
}

class Day23 {

    static void levelOrder(Node3 root) {
        Queue<Node3> qu = new LinkedList<>();

        if(root != null) {
            //enqueue current root
            qu.add(root);

            while (!qu.isEmpty()) {
                // dequeue next node
                Node3 tree = qu.remove();
                System.out.print(tree.data + " ");

                // enqueue child elements from next level in order
                if (tree.left != null) {
                    qu.add(tree.left);
                }
                if (tree.right != null) {
                    qu.add(tree.right);
                }
            }
        }
    }

    public static Node3 insert(Node3 root, int data) {
        if (root == null) {
            return new Node3(data);
        } else {
            Node3 cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node3 root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }
}
