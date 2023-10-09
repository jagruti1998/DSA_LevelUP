package LinkedList;

public class CreatingLL {

    // Define a Node class
    class Node {
        int data;
        Node next;

        public Node(int data) { // Constructor
            this.data = data; // Set the data for the node
            this.next = null;
        }
    }

    Node head = null; // Initially, the head is null

    // Insert a node at the head of the linked list
    void insertAtHead(int data) {
        Node newNode = new Node(data); // Create a new node with the given data
        if (head == null) {
            head = newNode; // If the list is empty, set the new node as the head
        } else {
            newNode.next = head; // Otherwise, set the new node's next to the current head
            head = newNode; // Update the head to be the new node
        }
    }

    // Print the linked list
    void printLL(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "--");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        CreatingLL cl = new CreatingLL();
        cl.insertAtHead(4); // Call the insertAtHead method on the cl object
        cl.insertAtHead(3); // Call the insertAtHead method on the cl object
        cl.insertAtHead(2); // Call the insertAtHead method on the cl object
        cl.insertAtHead(1); // Call the insertAtHead method on the cl object
        cl.insertAtHead(0); // Call the insertAtHead method on the cl object
        cl.printLL(cl.head); // Call the printLL method to print the linked list
    }
}
