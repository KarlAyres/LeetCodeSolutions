public class MergeTwoSortedLists {
    public static ListNode mergeTwoSortedLists(ListNode list1, ListNode list2) {

        // Create an empty tempListNode and sortedListNode
        ListNode tempListNode = new ListNode(0);
        ListNode sortedListNode = tempListNode;

        // Iterate lists until complete
        while (list1 != null && list2 != null) {

            // Compare values and sort accordingly
            if (list1.value < list2.value) {
                sortedListNode.next = list1;
                list1 = list1.next;
            }
            else {
                sortedListNode.next = list2;
                list2 = list2.next;
            }

            // Continue to next node
            sortedListNode = sortedListNode.next;
        }

        // Sort any remaining nodes
        if (list1 != null) {
            sortedListNode.next = list1;
            list1 = list1.next;
        }
        if (list2 != null) {
            sortedListNode.next = list2;
            list2 = list2.next;
        }
        return tempListNode.next;
    }
}
