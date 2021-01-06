package zuochengyun_Test;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import zuochengyun_book.Stack_MinValue1_P3;

public class Stack_MinValue1_P3_Test {
	public static void main(String args[]) {
		Stack_MinValue1_P3 stack1 = new Stack_MinValue1_P3();
		Stack_MinValue1_P3 stack2 = new Stack_MinValue1_P3();
		stack1.push(4);
		stack1.push(9);
		stack1.push(12);
		stack1.push(2);
		stack1.push(0);
		System.out.println("第一次弹出前的最小值："+stack1.getmin());
		//System.out.println(stack1.toString());
		System.out.printf("第一次弹出前的stackData："+stack1.stackData.toString()+'\n');  // 通过实例.类变量.toString 调用的是Stack实现的String接口中的方法
		// class Stack<E> extends Vector<E> {  Vector中 super.toString() public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E> {
		//System.out.println("第一次弹出前的stackData："+stack1.toString());              //调用的是实例.自己写的类方法
		System.out.printf("第一次弹出前的stackMin："+stack1.stackMin.toString()+'\n');
		stack1.pop();
		//System.out.println(stack1.toString());
		System.out.printf("第一次弹出后的stackData："+stack1.stackData.toString()+'\n');
		System.out.printf("第一次弹出后的stackMin："+stack1.stackMin.toString()+'\n');
		stack1.pop();
		System.out.printf("第二次弹出后的stackData："+stack1.stackData.toString()+'\n');
		System.out.printf("第二次弹出后的stackMin："+stack1.stackMin.toString()+'\n');
		stack1.pop();
		System.out.printf("第三次弹出后的stackData："+stack1.stackData.toString()+'\n');
		System.out.printf("第三次弹出后的stackMin："+stack1.stackMin.toString()+'\n');
	}

}
