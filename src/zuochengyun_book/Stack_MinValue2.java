package zuochengyun_book;

import java.util.Stack;

public class Stack_MinValue2 {
	public Stack<Integer> stackData;
	public Stack<Integer> stackMin;
	
	
	public Stack_MinValue2() {
		this.stackData = new Stack<Integer>();
		this.stackMin = new Stack<Integer>();
		
		
	}
	
	public void push(int NewNum) {
		if(stackMin.isEmpty()) {
			//throw new RuntimeException("Your stackMin is Empty!");
			stackMin.push(NewNum);
		} else if(NewNum <= this.getmin()) {
			stackMin.push(NewNum);
		} else {
			int NewMin = stackMin.peek();
			stackMin.push(NewMin);	
		}
		
		stackData.push(NewNum);	
	}
	
	
	public int pop() {
		if(stackData.isEmpty())
			throw new RuntimeException("Your stackData is Empty!");
		stackMin.pop();
		return stackData.pop();
		
	}
	
	public int getmin() {
		if (stackMin.isEmpty())
			throw new RuntimeException("Your stackMin is Empty!");
		return stackMin.peek();
	}
	
	@Override
	public String toString() {
		if(stackData.isEmpty())
			throw new RuntimeException("Your stackData is Empty!");
		return stackData.toString();
	}

}
