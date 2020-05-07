/**
 * 
 */
package com.epam.algo.ds.String;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Akansh_Rai
 *
 */
public class GenerateParentheses {

	public static void main(String[] args) {
		int n = 3;
		List<String> result = generateParentheses(new String(""), n, n, new ArrayList<String>() );
		System.out.println(result.toString());
		System.out.println(result.size());
	}

	private static List<String>  generateParentheses(String sb, int open, int close, List<String> result ) {
		if (open + close == 0) {
			result.add(sb);
			return result;
		}
		if (open > 0)
			generateParentheses(sb + "(", open - 1, close, result);
		if (close - open >= 1)
			generateParentheses(sb + ")", open, close - 1, result);
		
		return result;
	}

}
