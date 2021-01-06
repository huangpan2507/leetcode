package zuochengyun_Test;

import zuochengyun_book.Stack_MinValue2;

public class Stack_MinValue2_Test {
	public static void main(String args[]) {
		Stack_MinValue2 stack1 = new Stack_MinValue2();
		stack1.push(4);
		stack1.push(2);
		stack1.push(1);
		stack1.push(12);
		stack1.push(0);
		System.out.println("第一次弹出前的最小值："+stack1.getmin());
		System.out.println("第一次弹出前的stackData："+stack1.toString());     //调用的是实例.自己写的类方法
		System.out.println("第一次弹出前的stackData："+stack1.stackData.toString()); 
		System.out.println("第一次弹出前的stackData："+stack1.stackMin.toString()); 
		stack1.pop();
		System.out.println("第一次弹出后的最小值："+stack1.getmin());
		//System.out.println("第一次弹出后的stackData："+stack1.toString());     //调用的是实例.自己写的类方法
		System.out.println("第一次弹出后的stackData："+stack1.stackData.toString()); 
		System.out.println("第一次弹出后的stackData："+stack1.stackMin.toString()); 
		stack1.pop();
		System.out.println("第二次弹出后的最小值："+stack1.getmin());
		//System.out.println("第一次弹出后的stackData："+stack1.toString());     //调用的是实例.自己写的类方法
		System.out.println("第二次弹出后的stackData："+stack1.stackData.toString()); 
		System.out.println("第二次弹出后的stackData："+stack1.stackMin.toString());  //调用其他接口的方法
	}
	

}
