package smallHao;

import java.util.Arrays;

public class Nstyle_20Dayth {
	
	
	public static String convert(String s, int numRows) {
		if (numRows == 1) return s;
		String[] arr = new String[numRows];
		Arrays.fill(arr, "");
		int period = 2* numRows -2;                   //周期
		char[] chars = s.toCharArray();
		int len = chars.length;
		for(int i =0; i< len; i++) {
			int mod = i % period;
			if  (mod < numRows)
				arr[mod] += chars[i]; 
			
			else {
				arr[period - mod] += chars[i];         //在从0- N-1 再从N-1 到0，关键是找到mod >= numRows的位置
			}
		}
		
		StringBuilder res = new StringBuilder();        
		for (String ch: arr) {
			res.append(ch);
		}
		return res.toString();
		
	}
	
	public static void main(String[] args) {
		String aa = Nstyle_20Dayth.convert("LEETCODEISHIRING", 4);
		System.out.println(aa);
	}
}


	

	
	
