/**Given the head of a linked list, return the node where the cycle begins. If there is no cycle,
 *return null. There is a cycle in a linked list if there is some node in the list that can be reached
 * again by continuously following the next pointer. Internally, pos is used to denote the index of the
 * node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos
 * is not passed as a parameter. Do not modify the linked list.
 **/
public class LinkedListCycleNode {
    public static void main(String[] args) {
        int[] list = {3,2,0,-4};
        ListNode head = new ListNode();
        head = ListNode.arrayToLinkedList(list, list.length);
        ListNode.printList(head);
    }
    public static ListNode linkedListCycleNode(ListNode head) {

        // Initialise two pointers as head nodes, one fast and one slow
        ListNode fast = head;
        ListNode slow = head;

        // Iterate the list with both pointers until either fast reaches the end, or slow and fast meet
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // If the two meet, return slow to the head node
            if (fast == slow) {
                slow = head;

                // Parse at the same speed until they meet, this will be the node at which the cycle begins
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
