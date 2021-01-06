package demo2;

public class Node1 {
	//节点内容
	int data;
	//下一个节点
	Node1 next;
	public Node1(int data) {
		this.data = data; 
	}
	
	//为节点追加节点
	public Node1 append(Node1 node) {
		//记录当前节点
		Node1 currentNode = this;
		//循环向后找
		while(true) {
			//若已经到达最末端
			if(currentNode.next == null) {
				break;
			}
			//往后移动
			currentNode = currentNode.next;
			
		}
		//若已经是末尾，则直接追加节点
		currentNode.next = node;
		return this;
	}
	
	
	//插入一个节点做为当前节点的下一个节点
	public void after(Node1 node) {
		while(this.next != null) {
		Node1 nextNext = this.next;
		this.next = node;            
		node.next = nextNext;
		}
		if(this.next == null) {
			this.next = node;
		}
	}
	
	
	//显示所有节点信息
//	public void show() {
//		Node1 currentNode = this;
//		do {
//			data = currentNode.data;
//			System.out.println(data + "");
//			//获取下一个节点
//			currentNode = currentNode.next;
			
//		} while(currentNode != null);
//	}
	
	
	//显示所有节点信息
	public void show() {
		Node1 currentNode = this;
		while(true) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
			if(currentNode == null) {
				System.out.println("已经到达末尾了");
				break;
			}
		}
	}
	
	
	// 删除下一个节点
	public void removeNext() {
		while(this.next != null) {
		Node1 nextNext = this.next.next;
		this.next = nextNext;
		}
		if(this.next == null) {
		System.out.println("无法删除当前节点的下一个节点了");
		}
	}
	
	//获取下一个节点
	public Node1 next() {
		return this.next;
	}
	
	
	//获取节点中的数据
	public int getData() {
		return this.data;
	}
	
	
	//判断当前节点是否是最后一个节点
	public boolean isLast() {
		return this.next == null;
	}
	
}
