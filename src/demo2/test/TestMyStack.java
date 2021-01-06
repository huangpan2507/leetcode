//复写/改写代码
package demo2.test;

import demo2.MyStack1;

public class TestMyStack {

	public static void main(String[] args) {
		//利用自定义的栈方法，创建一个栈，里面就是一个初始话的数组
		MyStack1 ms = new MyStack1();
		//ms.check();
		// 查看数组内容
		ms.show();
		// 检查数组是否为空
		System.out.println(ms.isEmpty());
		//压入数组
		ms.push(9);
		ms.push(8);
		ms.push(7);
		//最出栈顶元素
		System.out.printf("压出的元素为："+ ms.pop() + '\n');
		System.out.printf("压出的元素为："+ ms.pop() + '\n');
		//System.out.println(ms.pop());
		//查看栈顶元素
		System.out.printf("查看栈顶元素: "+ ms.peek() + '\n');
		System.out.printf("检查栈是否为空" + ms.isEmpty() + '\n');
	}

}
