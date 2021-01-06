package zuochengyun_Test;

import zuochengyun_book.Stack_queue_P5;

public class Stack_queue_P5_Test {
	
	public static void main(String args[]) {
		Stack_queue_P5 stack1 = new Stack_queue_P5();
		//stack1.peek();
		stack1.add(5);
		
		stack1.add(6);
		stack1.add(0);
		System.out.println("stack 的内容是："+ stack1.stackPop.toString());
		System.out.println(stack1.poll());
		System.out.println(stack1.poll());
		System.out.println(stack1.peek());
		
	}

}
