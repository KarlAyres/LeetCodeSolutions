public class MiddleLinkedList {

    public static void main(String[] args) {
        int[] list = {1,2,3,4,5};
        ListNode head = new ListNode();
        head = ListNode.arrayToLinkedList(list, list.length);
        ListNode.printList(middleLinkedList(head));
    }

    public static ListNode middleLinkedList(ListNode head) {

        // Initialise two counters, counter1 to count the nodes and counter2 to count until halfway
        int counter1 = 0;
        int counter2 = 0;
        ListNode result = null;

        // Initialise two ListNodes to parse from the head node
        ListNode linkedList1 = head;
        ListNode linkedList2 = head;

        // Count the number of nodes within the first list
        while (linkedList1 != null) {
            counter1++;
            linkedList1 = linkedList1.next;

        }

        // Count the nodes again until counter1 / 2 is reached
        while (linkedList2 != null) {
            if (counter2 == (counter1/2)) {
                result = linkedList2;
            }

            counter2++;
            linkedList2 = linkedList2.next;

        }

        return result;
    }
}

