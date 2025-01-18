package Linked_List_15;

public class Copy_2 {
    public static void main(String[] args) {
        Node a = new Node(10);
        System.out.println(a);
        Node temp = a; //shallow copy
        System.out.println(a);
        System.out.println(temp);

        Node b = new Node(100);
        Node temp2 = new Node(b.val); //deep copy
        System.out.println(b);
        System.out.println(temp2);

        Node a1 = new Node(10);
        Node b1 = new Node(20);
        Node c1 = new Node(30);
        Node d1 = new Node(40);
        Node e1 = new Node(50);

        a1.next=b1;
        b1.next=c1;
        c1.next=d1;
        d1.next=e1;

        Node temp3=a1;
        System.out.println(temp3.val);
        temp3=temp3.next;
        System.out.println(temp3.val);
        temp3=a1;
        while(temp3!=null){
            System.out.println(temp3.val);
            temp3=temp3.next;
        }
    }
}
