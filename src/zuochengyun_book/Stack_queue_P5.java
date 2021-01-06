package zuochengyun_book;

import java.util.Stack;

public class Stack_queue_P5 {

	public Stack<Integer>  stackPush;
	public Stack<Integer>  stackPop;
	
	public Stack_queue_P5() {
		stackPush = new Stack<Integer>();
		stackPop = new Stack<Integer>();
		
	}
	
	private void stack_push_pop() {
		if(stackPop.isEmpty()) {
			while(!stackPush.isEmpty()) {
				stackPop.push(stackPush.pop());
				
			}
			
		}
		
	}
	
	public void add(int pushInt) {
		stackPush.push(pushInt);
		stack_push_pop();
		
	}
	
	
	public int poll() {
		if(stackPop.isEmpty() && stackPush.isEmpty()) {
			throw new RuntimeException("Your stack is Empty!");
			
		}
		stack_push_pop();
		return stackPop.pop();
		
	}
	
	
	public int peek() {
		if(stackPop.isEmpty() && stackPush.isEmpty()) {
			throw new RuntimeException("Your stack is Empty!");

		}
		stack_push_pop();
		return stackPop.peek();
		
	}
}
