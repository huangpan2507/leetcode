package leetcode;

import java.util.Stack;


/***
 * 
 * @author huangpan   使用栈来翻转顺序，栈中保存的是节点，妙啊！！！
 *
 */
public class Swap_node_24_stack {
	public int value;
	public Swap_node_24_stack next;
	public Swap_node_24_stack(int data) {
		this.value = data;
	}
	
	public Swap_node_24_stack swapPairs(Swap_node_24_stack head) {
		if(head == null || head.next == null) {
			return head;
		}
		Stack<Swap_node_24_stack> stack = new Stack<>();
		Swap_node_24_stack pre = new Swap_node_24_stack(-1);
		Swap_node_24_stack cur = head;
		head = pre;
		while(cur != null && cur.next != null) {
			//压入两个节点入栈
			stack.add(cur);
			stack.add(cur.next);
			
			//弹出一个节点，接在pre后面
			pre.next = stack.pop();
			// pre向后移动
			pre = pre.next;
			//弹出一个节点，接在pre后面
			pre.next = stack.pop();
			// pre向后移动
			pre = pre.next;
			//准备取后面的两个节点
			cur = cur.next.next;
		}
		//如果是奇数，则直接加到后面
		if(cur != null) { pre.next = cur; } else {
			pre.next = null;
		}
		
		return head.next;
		
		
		
		
	}
	

}
