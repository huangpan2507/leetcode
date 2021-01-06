package leetcode_Test;


import leetcode.Container_Most_Water_11;

public class Container_Most_Water_11_Test {
	public static void main(String[] args) {
		
		Container_Most_Water_11 h = new Container_Most_Water_11(new int[]{1,8,6,2,5,4,8,3,7});
		System.out.println("输出最大面积： "+h.maxArea1(h.a));                  //调用maxArea方法也可以
		//下面也可以，调用默认构造器
		//int[] height = new int[]{1,8,6,2,5,4,8,3,7};
		//Container_Most_Water_11 e = new Container_Most_Water_11();
		//System.out.println("输出最大面积： "+e.maxArea(height));
	}

}
