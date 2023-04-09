public class ReverseLinkedList {
    public static ListNode reverseLinkedList(ListNode head) {

        // Create an empty ListNode for the node previous to the head node
        ListNode previousNode = null;

        // Iterate ListNode until headNode = null
        while (head != null) {

            // New ListNode for the node following the head node
            ListNode nextNode = head.next;

            // Assign this next node to previousNode
            head.next = previousNode;

            // Assign the previousNode as head node
            previousNode = head;

            // Assign the head node to the nextNode, moving the head down the list
            head = nextNode;
        }

        return previousNode;
    }
}
