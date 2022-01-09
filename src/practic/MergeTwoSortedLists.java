package practic;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

     //   System.out.println(mergeTwoSortedLists.mergeTwoLists());
    }

     class ListNode {
      int val;
      ListNode next;
     public ListNode() {}
      ListNode(int val)
      {
          this.val = val;
      }
      ListNode(int val, ListNode next)
      {
          this.val = val;
          this.next = next;
      }
 }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
     ListNode head = new ListNode(0);
     ListNode resultList = head;
     if(l1 == null){
         return l2;
     }
     if(l2 == null){
            return l1;
        }
      while(l1 != null && l2 != null){
          if(l1.val <= l2.val) {
              resultList.next = l1;
              l1 = l1.next;
          }else{
              resultList.next = l2;
              l2 = l2.next;
          }
          resultList = resultList.next;
      }
      if(l1 != null){
          resultList.next = l1;
      }
        if(l2 != null){
            resultList.next = l2;
        }
        return head.next;
    }

}
