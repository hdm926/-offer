package dailyCoding;

public class reverseList {
	public ListNode ReverseList(ListNode head) {
		ListNode next,pre=null;

		while(head!=null) {
			next=head.next;//������һ���ڵ�
			head.next=pre;//��תͷ����ת��
			pre=head;//pre��head����ǰ
			head=next;//��headΪnull��ʱ��˵����ʱpre�����һ�����
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
  
