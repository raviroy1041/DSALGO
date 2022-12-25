package array;

import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {
    static Node head=null;
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void insert(int data){
        /*if(head==null){
          head=  new Node(data);
        }
        else{
            Node curr=head;
            while(curr!=null){
                curr=curr.next;
            }
            curr.next=new Node(data);
            curr=curr.next;
            curr.next=null;
        }*/

        Node new_node=new Node(data);
        new_node.next=head;
        head=new_node;
    }

    public static void main(String [] args){
        /*List<Node> list = new LinkedList<>();*/
        ReverseLinkedList list= new ReverseLinkedList();
       list.head = new Node(1);
        /*list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);*/

        list.insert(2);
        list.insert(3);
        list.insert(4);

        list.printList(head);
        head=list.reverese(head);
        list.printList(head);
    }

    private Node reverese(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    private void printList(Node node) {

        while(node!=null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
