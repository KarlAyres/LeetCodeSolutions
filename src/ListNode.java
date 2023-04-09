public class ListNode {

    // Data fields
    int value;
    ListNode next;
    static ListNode head;

    // No argument constructor
    ListNode() {
    }

    // Constructor with value field
    ListNode(int value) {
        this.value = value;
    }

    // Constructor with value and next node fields
    ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }

    // Print contents of linked list starting from head
    static void printList(ListNode head) {
        ListNode node = head;
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
    }

    // Insert node
    static ListNode insert(ListNode head, int value) {
        ListNode temp = new ListNode();
        temp.value = value;
        temp.next = head;
        head = temp;

        return head;
    }

    // Insert array
    static ListNode arrayToLinkedList(int[] array, int length) {
        head = null;
        for (int i = length - 1; i >= 0; i--) {
            head = insert(head, array[i]);
        }
        return head;

    }


}