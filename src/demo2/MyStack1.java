// 复写/改动的代码
package demo2;

import java.util.Arrays;

public class MyStack1 {
	
		//栈的底层使用数组来存储数据,此处相当于在类内部声明一个数组
		int[] elements;
		//制造一个创造栈的方法，方法内部就是定义了一个数组
		public MyStack1() {
			elements = new int[0];
			//int[] elements = new int[0];  //这样会报错，若改成这样，与上面的声明会冲突，
			//而去掉声明的话，下面就无法调用该数组
		}
		
		
		//压入元素
		public void push(int element) {
			int[] newarr = new int[elements.length + 1];
			for (int i = 0; i< elements.length; i++) {
				newarr[i] = elements[i];
				
			}
			//将将要压入的数放置新数组的末尾，也即压栈
			newarr[elements.length] = element;
			elements = newarr;
		}
		
		
		//取出栈顶元素
		public int pop() {
			//检查栈是否为空
			check();
			//取出栈顶的数值
			int element = elements[elements.length - 1];
			//创建一个新数组，用来保存出栈后的栈
			int[] newarr = new int[elements.length - 1];
			for (int i = 0; i < elements.length-1; i++) {
				newarr[i] = elements[i];
			}
			elements = newarr;
			//返回栈顶的元素
			return element;
		}
		
		
		//检查栈是否为空
		public void check() {
			if (elements.length == 0) {
				throw new RuntimeException("stack is empty!");
			}
		}
		
		
		//查看栈顶元素
		public int peek() {
			check();
			int element = elements[elements.length-1];
			return element;
		}
		
		//判断栈是否为空
		public boolean isEmpty() {
			return elements.length == 0;
		}
		
		//显示数组内容
		public void show() {
			System.out.println(Arrays.toString(elements));
		}
}
