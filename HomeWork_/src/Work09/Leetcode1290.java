package Work09;

public class Leetcode1290 {
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
        public int getDecimalValue(ListNode head) {
          int res=0;
          StringBuffer sb=new StringBuffer();
          ListNode temp=head;
            while (temp.next!=null) {
                sb.append(temp.val);
                head = head.next;
            }
            sb.append(temp.val);
            String str=sb.toString();
            for(int i=0;i<str.length();i++){
                res+=(str.charAt(i)-48)*Math.pow(2,str.length()-i-1);
            }
            return res;
        }

}
