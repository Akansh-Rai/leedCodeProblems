/**
 * 
 */
package com.epam.algo.ds.tree;

import java.util.List;

/**
 * @author Akansh_Rai
 *
 */
public class Node {
	public int val;
	public List<Node> children;

	public Node() {
	}

	public Node(int _val) {
		val = _val;
	}

	public Node(int _val, List<Node> _children) {
		val = _val;
		children = _children;
	}
}
