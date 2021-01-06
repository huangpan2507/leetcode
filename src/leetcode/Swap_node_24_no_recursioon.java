package leetcode;

//方法二：不使用递归
public class Swap_node_24_no_recursioon {
	public int value;
	public Swap_node_24_no_recursioon next;
	public Swap_node_24_no_recursioon() {}
	public Swap_node_24_no_recursioon(int data) {
		this.value = data;
	}
	
	public Swap_node_24_no_recursioon swapPairs(Swap_node_24_no_recursioon head) {
		Swap_node_24_no_recursioon pre = new Swap_node_24_no_recursioon(0);                 //添加空头节点
		pre.next = head;
		//创建三个指针temp，start，end,这个temp的作用就是保存已经调整好节点的头节点，方便其他节点与之相连
		// start end用来调整两个节点的顺序
		//这步很关键，tmp指针用来处理边界条件的
		//假设链表是1->2->3->4，a指向1，b指向2
		//改变start和end的指向，于是就变成2->1，但是1指向谁呢？
		//1是不能指向2的next，1应该指向4，而循环迭代的时候一次处理2个节点
		//1和2的关系弄清楚了，3和4的关系也能弄清楚，但需要一个指针来处理
		//2->1，4->3的关系，tmp指针就是干这个用的

		Swap_node_24_no_recursioon temp = pre;
		while(head.next != null || head.next.next != null) {
			Swap_node_24_no_recursioon start = temp.next;
			Swap_node_24_no_recursioon end = temp.next.next;
			temp.next = end;
			start.next = end.next;          //要先保存后面的联系，不然断了， 最后最后会指向null
			end.next = start;
			temp = start;                   //temp向后移动
			end  = start;                   //start end 已经调转了顺序，所以end要向后移动
 		}
		return pre.next;                   //返回除去自己新加空头节点后的节点
	}
	
	
	

}
