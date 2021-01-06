package recursion;


import java.util.Arrays;

/**
 * 
 * @author 疯狂龅牙酥
 *
 */

public class RecursionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparable[] c = new Comparable[] {1,2,3,4};
		OrderedCollection arr = new OrderedCollection(c);
		System.out.println(arr.findMax());
		System.out.println(arr.findMin());
		System.out.println(Arrays.toString(arr.getOrderedCollection()));
		System.out.println(arr.isEmpty());
		arr.makeEmpty();
		System.out.println(arr.isEmpty());
		arr.insert(8);
		arr.insert(9);
		arr.insert(10);
		System.out.println(arr.isEmpty());
		System.out.println(Arrays.toString(arr.getOrderedCollection()));
		arr.remove(1);
		System.out.println(arr.isEmpty());
		System.out.println(Arrays.toString(arr.getOrderedCollection()));
		System.out.println(arr.findMax());
		System.out.println(arr.findMin());
		arr.remove(0);
		arr.remove(0);
		System.out.println(arr.isEmpty());
		System.out.println(Arrays.toString(arr.getOrderedCollection()));
		System.out.println(arr.findMin());
	}

}

class OrderedCollection{
	private Comparable[] obj;
	private int length = 0;
	public OrderedCollection(Comparable[] obj) {
		this.obj = obj;
		this.length = obj.length;
	}
	
	public Comparable[] getOrderedCollection() {
		return this.obj;
	}
	
	public boolean isEmpty() {
		return this.length == 0;
	}
	
	public void makeEmpty() {
		this.obj = new Comparable[] {};
		this.length = 0;
	}
	
	public void insert(Comparable c) {
		Comparable[] tmp = new Comparable[this.length+1];
		System.arraycopy(this.obj, 0, tmp, 0, this.length++);
		tmp[this.length-1] = c;
		this.obj = tmp;
	}
	
	public void remove(int index) {
		Comparable[] tmp = new Comparable[this.length-1];
		System.arraycopy(this.obj, 0, tmp, 0, index);
		System.arraycopy(this.obj, index + 1, tmp, index, --this.length-index);
		this.obj = tmp;
	}
	
	public Comparable findMax() {
		if(this.obj == null || this.length==0) {
			return null;
		}else {
			Comparable max = this.obj[0];
			for(int i=1; i<this.length; i++) {
				if(max.compareTo(this.obj[i])<0) {
					max = this.obj[i];
				}
			}
			return max;
		}
	}
	
	public Comparable findMin() {
		if(this.obj == null || this.length==0) {
			return null;
		}else {
			Comparable min = this.obj[0];
			for(int i=1; i<this.length; i++) {
				if(min.compareTo(this.obj[i])>0) {
					min = this.obj[i];
				}
			}
			return min;
		}
	}
	
}
