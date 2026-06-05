package collections.linkedlist;

public class DoublyLinkedListTes {

    public static void main(String[] args) {

      DoublyLinkedList d1 = new DoublyLinkedList();




        d1.InsertAtBeginning(1);

        System.out.println(d1.head);



    }



}
class DoublyLinkedList{

    Node head ;





    class Node{

        Node prev ;

        int data;

        Node next;




        Node(int val){

            this.data =val;


        }

    }





    void InsertAtBeginning(int value){

       Node newnode= new Node(value);

       head =newnode;
    }

}

