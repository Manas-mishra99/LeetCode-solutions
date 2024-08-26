/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int temp=0, carry=0;
        ListNode l3 = new ListNode();
        ListNode l4 = l3;
        while(l1!=null || l2!= null || carry==1){
            int sum1=0;
            if(l1!=null ){
            sum1+=l1.val;
            l1=l1.next;
            }
    
            if(l2!=null){
            sum1+=l2.val;
            l2=l2.next;
            }
            sum1+=carry;
            carry=sum1/10;
            temp=sum1%10;
            ListNode temp1= new ListNode(temp);
            l3.next=temp1;
            l3=l3.next;
           
        }
        return l4.next;
        
    }
}