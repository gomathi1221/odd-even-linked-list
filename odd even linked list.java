class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return head;
        }
       ListNode slow=head;
       ListNode fast=head.next;
       ListNode fast2=fast;
       while(fast!=null&&fast.next!=null){
        slow.next=slow.next.next;
        fast.next=fast.next.next;
        fast=fast.next;
        slow=slow.next;
       }
       slow.next=fast2;
       return head;

        
    }
}