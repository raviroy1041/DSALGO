package Tree.BTree;

import java.util.Stack;

class Node
{
    int data;
    Node left, right;

    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}

public class InorderWithoutRecursion {

    public static void main(String args[])
    {

        /* creating a binary tree and entering
        the nodes */
        Node root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);

        inorder(root);
    }

    private static void inorder(Node root) {

        Stack<Node> s=new Stack<>();
        Node curr=root;

        while(curr!=null || s.size()>0){
            while(curr!=null){

                s.push(curr);
                curr=curr.left;
            }
            curr=s.pop();
            System.out.println(curr.data+" ");
            curr=curr.right;
        }



    }

}
