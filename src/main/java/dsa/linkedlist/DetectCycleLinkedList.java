package dsa.linkedlist;

public class DetectCycleLinkedList {

    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Solution using cycle length (safe version)
    public static ListNode detectCycle(ListNode head) {

        if (head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        // 1. Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }

        // No cycle
        if (fast == null || fast.next == null) {
            return null;
        }

        // 2. Calculate cycle length
        int cycleLength = 1;
        ListNode temp = slow.next;
        while (temp != slow) {
            temp = temp.next;
            cycleLength++;
        }

        // 3. Find cycle start
        ListNode p1 = head;
        ListNode p2 = head;

        // Move p2 ahead by cycle length
        for (int i = 0; i < cycleLength; i++) {
            p2 = p2.next;
        }

        // Move both pointers one step
        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p1; // cycle start
    }

    // ------------------ MAIN METHOD ------------------
    public static void main(String[] args) {

        // Create nodes
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(-4);

        // Build list: 3 -> 2 -> 0 -> -4
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        // Create cycle: -4 -> 2
        n4.next = n2;

        // Detect cycle
        ListNode cycleStart = detectCycle(n1);

        if (cycleStart != null) {
            System.out.println("Cycle starts at node with value: " + cycleStart.val);
        } else {
            System.out.println("No cycle detected");
        }
    }
}
