class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1;
        ListNode cur = list1;
        for (int i = 0;i<=b;i++){
            cur=cur.next;
        }
        for (int i =0;i<a-1;i++){
            temp = temp.next;
        }
        temp.next = list2;
        ListNode tail = list2;
        while(tail.next!=null){
            tail = tail .next;
        }
        tail.next = cur;
        return list1;
        
    }
}