package dsa.linkedlist;

public class MainTest {
    public static void main(String[] args) {
        System.out.println("Linked List");

        LinkedList testLinkedList = new LinkedList(10);
        testLinkedList.add(20);
        testLinkedList.add(30);
        testLinkedList.add(40);
        testLinkedList.add(50);
        testLinkedList.add(60);
        testLinkedList.print();
    }
}
