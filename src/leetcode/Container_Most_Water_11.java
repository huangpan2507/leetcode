package leetcode;



public class Container_Most_Water_11 {
	public int[] a = new int[9];
	public Container_Most_Water_11() {}
	public Container_Most_Water_11(int[] b) {
		this.a = b;
	}
	//i，j为两个坐标，思想：移动较短的边height[i] 
	public int maxArea(int[] height) {
		int i=0, j=height.length-1;
		int rea=0;
		while(i<j) {
			if (height[i] < height[j]) {
				rea = max(rea, height[i]*(j-i));
				i++;
			} else {
				rea = max(rea, height[j]*(j-i));
				j--;
			}
			
		}
		return rea;
	}

	private int max(int i, int j) {
		// TODO Auto-generated method stub
		return i>j? i:j;
	}
	
	private int min(int i, int j) {
		// TODO Auto-generated method stub
		return i<j? i:j;
	}
	
	public int maxArea1(int[] height) {
		int i=0, j=height.length-1, res=0;
		while(i<j) {
			res = max(res, min(height[i], height[j])*(j-i));
			if(height[i] < height[j]) { i++; } else {
				j--;
			}
		}
		return res;
	}
	
		
}
