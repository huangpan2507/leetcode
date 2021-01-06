package demo2.test;

import demo2.MyQueue1;

public class TestMyQueue {

	public static void main(String[] args) {
		//创建一个队列
		MyQueue1 mq = new MyQueue1();
		//判断是否为空
		System.out.println(mq.isEmpty());
		//显示数组内容
		mq.show();
		
		//入队
		mq.add(9);
		mq.add(8);
		mq.add(7);
		mq.show();
		//出队
		System.out.println(mq.poll());
		mq.show();
		mq.add(6);
		mq.show();
		System.out.println(mq.poll());
		System.out.println(mq.poll());
		System.out.println(mq.isEmpty());
		System.out.println(mq.poll());
	}
	
}
