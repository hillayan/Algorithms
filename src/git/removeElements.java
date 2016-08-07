package git;
public class removeElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode aa = new ListNode(1);
		aa.next = new ListNode(2);
		aa.next.next = new ListNode(3);
		aa.next.next.next = new ListNode(4);

		ListNode aa1 = new ListNode(1);
		aa1.next = new ListNode(1);

		ListNode result = removeElements2(aa1, 1);

	}

	public static ListNode removeElements2(ListNode head, int val) {

		if (head == null) {
			return null;
		}

		ListNode result = new ListNode(0);
		result.next = head;

		ListNode temp = result;

		while (temp != null) {
			if (temp.next != null && temp.next.val == val) {
				temp.next = remove(temp.next, val);
			}
			temp = temp.next;
		}

		return result.next;
	}

	public static ListNode remove(ListNode head, int val) {
		if (head == null) {
			return null;
		}

		if (head.val == val) {
			return remove(head.next, val);

		} else {
			return head;
		}
	}
}
