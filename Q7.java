class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null) {
            return null;
        }

        ListNode oddDummy = new ListNode(-1);
        ListNode evenDummy = new ListNode(-1);

        ListNode oddTail = oddDummy;
        ListNode evenTail = evenDummy;

        ListNode curr = head;
        int i = 1;

        while(curr != null) {
            if(i % 2 != 0) {
                oddTail.next = curr;
                oddTail = oddTail.next;
            }
            else {
                evenTail.next = curr;
                evenTail = evenTail.next;
            }
            i++;
            curr = curr.next;
        }

        oddTail.next = evenDummy.next;
        evenTail.next = null;

        return oddDummy.next;
    }
}