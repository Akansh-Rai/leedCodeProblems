/**
 * 
 */
package com.epam.algo.ds.maths;

/**
 * @author Akansh_Rai
 * https://leetcode.com/problems/multiply-strings/
 */
public class MultiplyStrings {
	
	public static void main(String[] args) {
		String num1 = "9341324";
		String num2 = "934123412";
		
		/*if(num1.length() == 1) {
            if (num1.charAt(0) - '0' == 0) return "0";            
            if (num1.charAt(0) - '0' == 1) return num2;
        }
        
        if (num2.length() == 1) {
            if (num2.charAt(0) - '0' == 0) return "0";
            if (num2.charAt(0) -'0' == 1) return num1;
        }*/
            
        if(num1.length() < num2.length()) {//swap
			String temp = num1;
			num1 = num2;
			num2 =temp;
		}
		
		
		System.out.println(multiply(num1, num2));
				
	}

	private static String multiply(String num1, String num2) {
		int len1 = num1.length() -1 ;
		int len2 = num2.length() -1 ;
		
		int unit = 0;
		boolean flag = true;
		String last = "";
		while (len2 >= 0) {
			String line = "";
			int curMultiplier = num2.charAt(len2) - '0';
			for(int i=0; i < unit; i++) {
				line +="0";
			}
			unit++;
			int carry = 0;
			for(int i = len1; i >= 0; i--) {
				int cur = num1.charAt(i) - '0';
				int result = cur * curMultiplier + carry;
				line = result%10 + line;
				carry= result/10;				
			}
			if (carry != 0) line = carry+line;
			
			//sum all
			if (flag) {				
				flag = !flag;
				last = line;
			} else {
				last = addNumber(line, last);
			}
			
			len2--;
		}
		return last;
	}

	private static String addNumber(String num1, String num2) {
		int len1 = num1.length() - 1;
		int len2 = num2.length() - 1;
		int carry = 0;
		int sum = 0;
		String result = "";
		while (len1 >= 0 || len2 >= 0 || carry == 1) {
			carry += ((len1>=0) ? num1.charAt(len1) - '0' : 0);
			carry += ((len2>=0) ? num2.charAt(len2) - '0' : 0);
			result = carry%10+ result;
			carry = carry/10;
			len1--;len2--;
		}
		
		
		return result;
	}

}
