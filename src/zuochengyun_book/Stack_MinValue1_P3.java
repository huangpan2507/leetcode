package zuochengyun_book;


import java.util.Stack;

public class Stack_MinValue1_P3 {
	
	//private Stack<Integer> stackData;   //此时测试代码中无法访问private变量
	public Stack<Integer> stackData;
	public Stack<Integer> stackMin;
	
	
	public  void Stack_MinValue1() {
		
		this.stackData = new Stack<Integer>();
		this.stackMin = new Stack<Integer>();
		
	}
	
	public void push(int NewNum) {
		if (this.stackMin.isEmpty()) {
			this.stackMin.push(NewNum);
			
		} else if(NewNum <= this.getmin()) {
			this.stackMin.push(NewNum);
		}
		
		this.stackData.push(NewNum);
			
	}
	
	
	
	public int pop() {
		//与push相对应
		if (this.stackData.isEmpty()) {
			throw new RuntimeException("Your Stack is Empty!");
		}
		int value = this.stackData.pop();
		if(value ==  this.getmin()) {          //此处是为了把StackMin当成副本，当StackData弹成空时，StackMin也弹成空
			this.stackMin.pop();
		}
		return value;
		
	}
	
	public int getmin() {
		if(this.stackMin.isEmpty()) {
			throw new RuntimeException("Your Stack is Empty!");
		}
		return this.stackMin.peek();
	}
		
	@Override
	public String toString() {
		if(this.stackData.isEmpty())
			throw new RuntimeException("Your Stack is Empty!");
		
		//String stackdata = this.stackData.toString();
		//String stackmin = this.stackMin.toString();
		//return stackdata;
		return super.toString();
		
	}
	
}
