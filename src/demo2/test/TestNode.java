package demo2.test;

import demo2.Node;

public class TestNode {
	
	public static void main(String[] args) {
		//创建节点
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		System.out.println("=======显示初始的节点内容========");
		n1.show();
		n1.after(new Node(0));
		n1.show();
		n2.show();
		n3.show();
		System.out.println("=======结束显示初始的节点内容========");
		//追加节点
		n1.append(n2).append(n3).append(new Node(4));
		
		//取出下一个节点的数据
		System.out.println(n1.next().getData());
		//判断节点是否为最后一个节点
		System.out.println(n1.isLast());
//		System.out.println(n1.next().next().next().isLast());
		
		//显示所有节点内容
		System.out.println("=======显示追加后的节点内容========");
		n1.show();
		System.out.println("=======结束显示节点内容========");
		//删除一个节点
		
		n1.next().removeNext();
		n1.show();
		n1.next().removeNext();
		n1.show();
		n1.removeNext();
		//n1.next().removeNext();
		//显示所有节点内容
		n1.show();
		//插入一个新节点
		Node Node = new Node(5);
		n1.next().after(Node);
		n1.show();
	}

}
