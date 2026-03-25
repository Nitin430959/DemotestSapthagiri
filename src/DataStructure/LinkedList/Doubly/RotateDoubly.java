package DataStructure.LinkedList.Doubly;

class Node{
    char data;
    Node next;
    Node prev;

    Node(char data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
public class RotateDoubly {
    Node head;

    RotateDoubly() {
        head = null;
    }

    void insertAtHead(char val) {
        Node n = new Node(val);
        if (head != null) {
            n.next = head;
            head.prev = n;

        }
        head = n;
    }
    void RotateByN(int N){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;
        head.prev=temp;
        while(--N>0){
            head=head.next;
            temp=temp.next;
        }
    }


    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
class Driver1{
    public static void main(String[] args){
        RotateDoubly dll=new RotateDoubly();
        dll.insertAtHead('F');
        dll.insertAtHead('E');
        dll.insertAtHead('D');
        dll.insertAtHead('C');
        dll.insertAtHead('B');
        dll.insertAtHead('A');
        dll.display();
        int N=3;

        dll.RotateByN(N);

        dll.display();
    }
}



