class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

class ReverseKNodes {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode current = head;
        int count = 0;

        // Count the number of nodes in the list
        ListNode tempHead = head;
        while (tempHead != null) {
            count++;
            tempHead = tempHead.next;
        }

        while (count >= k) {
            ListNode first = prev.next;
            ListNode tail = current;

            // Reverse the k-group
            for (int i = 0; i < k; i++) {
                ListNode temp = current.next;
                current.next = prev.next;
                prev.next = current;
                current = temp;
            }

            first.next = current;
            prev = tail;
            count -= k;
        }

        return dummy.next;
    }

    // Helper method to create a linked list from an array of integers
    public static ListNode createLinkedList(int[] values) {
        if (values == null || values.length == 0) {
            return null;
        }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }

        return dummy.next;
    }

    // Helper method to print the linked list
    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create a sample linked list from an array of values
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ListNode head = createLinkedList(values);

        int k = 3; // Set the size of k for reversing groups

        // Print the original linked list
        System.out.println("Original Linked List:");
        printLinkedList(head);

        // Reverse the linked list in k-node groups
        ReverseKNodes solution = new ReverseKNodes();
        head = solution.reverseKGroup(head, k);

        // Print the reversed linked list
        System.out.println("\nReversed Linked List in " + k + "-node groups:");
        printLinkedList(head);
    }
}
