package LinkedList;

// Definition for singly-linked list
class ListNode1 {
    int val;
    ListNode next;

    // Default constructor
    ListNode1() {}

    // Constructor with value
    ListNode1(int val) {
        this.val = val;
    }

    // Constructor with value and next node reference
    ListNode1(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class MergeLinkedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Base cases: If one of the lists is null, return the other list
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        // Compare the values of the current nodes in both lists
        if (list1.val < list2.val) {
            // If list1's value is smaller, merge the rest of list1 with list2
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            // If list2's value is smaller or equal, merge the rest of list2 with list1
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    public static void main(String[] args) {
        // You can test the mergeTwoLists function here
    }
}
