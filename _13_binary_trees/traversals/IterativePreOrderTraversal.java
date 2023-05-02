package _13_binary_trees.traversals;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class IterativePreOrderTraversal {

    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(8);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);

        System.out.println(preOrderTraversal(root));
    }

    private static ArrayList<Integer> preOrderTraversal(Node root) {

        ArrayList<Integer> ans = new ArrayList<>();

        ArrayDeque<Node> st = new ArrayDeque<>();   // stack

        st.push(root);

        while (!st.isEmpty()) {
            Node top = st.pop();

            ans.add(top.data);
            if(top.right != null) st.push(top.right);
            if(top.left != null) st.push(top.left);
        }

        return ans;

    }
}
