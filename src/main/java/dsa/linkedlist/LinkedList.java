package dsa.linkedlist;

public class LinkedList {
    private  Node head;
    private Node tail;
    private int length;

    public LinkedList(){

    }

    public LinkedList(int value){
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public void add(int value){
        Node newNode = new Node(value);
       if(head == null){
           this.head = newNode;
           this.tail = newNode;
       } else{
           this.tail.next = newNode;
       }

    }

    public void print(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        StringBuilder str = new StringBuilder();
        while(current != null){
            str.append(" ").append(current.value);
            current = current.next;
        }

        System.out.println("Your Linked list: "+ str);
    }

}
