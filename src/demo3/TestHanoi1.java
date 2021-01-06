package demo3;

public class TestHanoi1 {
	
	public static void main(String[] args) {
		hanoi(5, 'A','B','C');
	}
	
	
	public static void hanoi(int n, char from, char in, char to) {
		if(n == 1) {
			System.out.println("将第1盘子从"+ from+"移到"+to);

		} else {
			hanoi(n-1, from, to, in);
			System.out.println("将第"+ n + "个盘子从"+ from +"移动"+to);
			hanoi(n-1, in, from, to);
		}
	}
}
