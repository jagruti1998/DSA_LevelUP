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

    // Insert a node at a specific position in the linked list
    void insertInMiddle(int data, int pos) {
        if (pos == 0) {
            insertAtHead(data); // Insert at the head if position is 0
        } else {
            Node temp = head;
            for (int i = 1; i < pos; i++) {
                if (temp == null) {
                    System.out.println("Position is out of bounds.");
                    return;
                }
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Position is out of bounds.");
                return;
            }
            Node newNode = new Node(data);
            newNode.next = temp.next;
            temp.next = newNode;
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

    // Reverse the linked list
    Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next; // Store the next node
            current.next = prev; // Reverse the current node's pointer
            prev = current; // Move prev to the current node
            current = next; // Move current to the next node
        }

        return prev; // New head of the reversed list
    }

    public static void main(String args[]) {
        CreatingLL cl = new CreatingLL();
        cl.insertAtHead(4);
        cl.insertAtHead(3);
        cl.insertAtHead(2);
        cl.insertAtHead(1);
        cl.insertAtHead(0);

        cl.insertInMiddle(10, 3); // Insert 10 at position 3
        cl.printLL(cl.head);

        // Reverse the linked list
        cl.head = cl.reverse(cl.head);
        cl.printLL(cl.head); // Print the reversed linked list
    }
}
