package zuochengyun_book;

import book_java_data.return_k_th;

public class Node_part_P41 {
	public int value;
	public Node_part_P41 next;                         //下一个节点
	public Node_part_P41 (int data) {
		this.value = data;
	}


	public void printCommonPart(Node_part_P41 head1, Node_part_P41 head2) {
		System.out.print("Common part: "+" ");
		while (head1 != null && head2 != null) {
			if (head1.value < head2.value) {
				head1 = head1.next;
			} else if (head1.value > head2.value) {
				head2 = head2.next;
			} else {
				System.out.print(head1.value + " ");
				head1 = head1.next;
				head2 = head2.next;
			}
		}
		System.out.println();
	  }	
	
	
	//插入一个节点做为当前节点的下一个节点
	public void after(Node_part_P41 node) {             //这是在this当前节点上修改的，所以不用返回，节点已经改变
		if (this.next == null) {
			this.next = node;
		} else {
			while (this.next != null) {
				Node_part_P41 nextNext = this.next;     //存储下一个节点，否则会丢失
				this.next = node;
				node.next = nextNext;
				
			}
		}
		
	}
	
	
	//为节点追加节点,需要先找到节点末尾再追加
	public Node_part_P41 append(Node_part_P41 node) {
		
		Node_part_P41 currentNode = this;     // 记录当前节点
		
		while(true) {
			if (currentNode.next == null ) { break; }
			currentNode = currentNode.next;	
		}
		currentNode.next = node;
		return this;
		
	}
	
	
	//显示所有节点信息
	public void show() {
		Node_part_P41 currentNode = this;          
		while(true) {
			if (currentNode != null) {
				System.out.println("当前节点:" + currentNode.value);
				currentNode = currentNode.next;
			} else {
				System.out.println("已经到达节点末尾!!!");
				break;
			}
		}
		
	}
	
	
	// 删除下一个节点
	public Node_part_P41 removeNext() {
		Node_part_P41 currentNode = this;
		while(currentNode.next != null) {
			Node_part_P41 nextNextNode = currentNode.next.next;
			currentNode.next = nextNextNode;	
		}
		System.out.println("已到节点末尾，无法再删除!!!!!");
		
		return this;	
	}
	
	
	//获取下一个节点
	public Node_part_P41 next() {
		return this.next;
	}
	
	//获取节点中的数据
	public int getdata() {
		return this.value;
	}
	
	//当前节点是否为最后一个节点
	public boolean isLast() {
		return this.next ==null;
	}
	
	
	
	
	
	
	
	
	
}
