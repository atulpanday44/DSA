package linkedList;

public class basics {

    // Creation of linkedlist

    public static class Node{
        int data;
        Node next;

        Node(int data){
             this.data= data;
         }
    }

    public static void printList(Node head){
        Node temp = head;
        while( temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public static void printRec( Node head){
        if(head == null) return;
        System.out.print(head.data +" ");
        printRec(head.next);
    }

    // for printing in reverse order


    public static void printRev( Node head){
        if(head == null) return;
        printRec(head.next);
        System.out.print(head.data +" ");
    }

    public static void main(String[] args) {

        Node a= new Node(2);
        Node b= new Node(4);
        Node c= new Node(6);
        Node d= new Node(8);
        a.next =b;
        b.next =c;
        c.next =d;

        printRev(a);
       // printRec(a);

//        Node temp = a;
//        while( temp != null){
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }

//        for(int i=1; i<=4; i++){
//            System.out.println(temp.data +" ");
//            temp=temp.next;
//        }
    }
}
