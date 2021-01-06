package demo1;


import demo1.util.MyArray1;

public class TestMyArray {

	public static void main(String[] args) {
		//创建一个可变的数组
		MyArray1 ma = new MyArray1();
		//获取长度
		int size = ma.size();
		System.out.println(size);
		ma.show();
		//往可变数组中添加一个元素
		ma.add(89);
		System.out.println(ma.size());
		ma.add(90);
		ma.add(91);
		//显示可变数组中的所有元素到控制台
		ma.show();
		//删除某个元素
		ma.delete(1);
		ma.show();
		//取出指定位置的元素
		int element = ma.get(1);
		System.out.println(element);
		System.out.println("=====================");
		ma.add(94);
		ma.add(97);
		ma.add(98);
		ma.show();
		//插入元素到指定位置
		ma.insert(3, 33);
		ma.show();
		System.out.println("=====================");
		//替换指定位置的元素
		ma.set(3, 96);
		ma.show();
		System.out.println(ma.size());
		//线性查找，前提是已经排好序
		int ret = ma.binarySearch(94);
		System.out.println(ret);
		//线性查找
		int ret2 = ma.search(97);    
		System.out.println(ret2);
	}

}
