class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode current=head;
        int size=0;
        while(current!=null)
        {
            size++;
            current=current.next;
        }
        size-=k;
        ListNode first=head;
        ListNode second=head;
        for(int i=1;i<k;i++)first=first.next;
        for(int i=0;i<size;i++)second=second.next;
        if(first==null || second==null)return head;
        int tem=first.val;
        first.val=second.val;
        second.val=tem;
        return head;
    }  
}
