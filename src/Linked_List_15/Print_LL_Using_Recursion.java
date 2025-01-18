package Linked_List_15;

public class Print_LL_Using_Recursion {
    public static void displayrec(Node a){
        if(a==null) return;
        System.out.println(a.val);
        displayrec(a.next);
    }
    public static void main(String[] args) {
        Node a1 = new Node(10);
        Node b1 = new Node(20);
        Node c1 = new Node(30);
        Node d1 = new Node(40);
        Node e1 = new Node(50);

        a1.next=b1;
        b1.next=c1;
        c1.next=d1;
        d1.next=e1;

        displayrec(a1);
    }
}
