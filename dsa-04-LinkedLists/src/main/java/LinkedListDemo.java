import java.util.ArrayList;

public class LinkedListDemo {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        Node2 node21 = new Node2(1);
        Node2 node22 = new Node2(2);
        Node2 node23 = new Node2(23);

        node21.next = node22;
        node22.next = node23;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.println("node21 = " + node21+" next = "+node21.next);
        System.out.println("node22 = " + node22+" next = "+node22.next);
        System.out.println("node23 = " + node23+" next = "+node23.next);
        System.out.println("Node1's address is: " + node1 + "Node1' next address is " + node1.next);
        System.out.println("Node2's address is: " + node2 + "Node2' next address is " + node2.next);
        System.out.println("Node3's address is: " + node3 + "Node3' next address is " + node3.next);
        System.out.println("Node4's address is: " + node4 + "Node4' next address is " + node4.next);

        Node current;
        Node head = node1;
        current = head;
        while (current != null) {
            System.out.println("Id of node is: " + current.id);
            current = current.next;
        }


    }


}
