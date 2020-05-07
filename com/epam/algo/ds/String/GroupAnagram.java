/**
 * 
 */
package com.epam.algo.ds.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Akansh_Rai
 * 
 *         https://leetcode.com/problems/group-anagrams/
 * 
 *         Given an array of strings, group anagrams together. 
 *         Example: Input:
 *                        ["eat", "tea", "tan", "ate", "nat", "bat"],
 *         
 *          Output: [["ate","eat","tea"], ["nat","tan"], ["bat"] ]
 */
public class GroupAnagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		for(List<String> list : groupAnagram(strs)) {
			System.out.println(list.toString());
		}
	}

	private static List<List<String>> groupAnagram(String[] input) {
		
		if (input.length == 0) return new ArrayList();
		
		Map<String, List> ans = new HashMap<String, List>();
		for (String s : input) {
			char[] ca = s.toCharArray();
			Arrays.sort(ca);
			String key = String.valueOf(ca);
			if (!ans.containsKey(key)) {
				ans.put(key, new ArrayList());
			}
			ans.get(key).add(s);
		}
		return new ArrayList(ans.values());
	}

}
