package dailyCoding;

public class reverseList {
	public ListNode ReverseList(ListNode head) {
		ListNode next,pre=null;

		while(head!=null) {
			next=head.next;//保存下一个节点
			head.next=pre;//倒转头结点的转向
			pre=head;//pre和head都往前
			head=next;//当head为null的时候说明此时pre是最后一个结点
		}
		return pre;
    }

}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
  
