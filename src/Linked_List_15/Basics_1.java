package Linked_List_15;

import java.util.*;

class Node {
    int val;
    Node next; //by default next have null value

    Node(int val) {
        this.val = val;
    }
}

public class Basics_1 {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        System.out.println(a.val);
        System.out.println(b.val);
        System.out.println(c.val);
        System.out.println(d.val);
        System.out.println(e.val);

        System.out.println();

        System.out.println(a.next); //by default next have null value
        System.out.println(b.next);
        System.out.println(c.next);
        System.out.println(d.next);
        System.out.println(e.next);

        System.out.println();

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(b);
        System.out.println(a.next);

        System.out.println();

        System.out.println(a.val);
        System.out.println(b.val);
        System.out.println(c.val);
        System.out.println(d.val);
        System.out.println(e.val);

        System.out.println();

        System.out.println(a.val);
        System.out.println(a.next.val);
        System.out.println(a.next.next.val);
        System.out.println(a.next.next.next.val);
        System.out.println(a.next.next.next.next.val);

        System.out.println();
    }
}
