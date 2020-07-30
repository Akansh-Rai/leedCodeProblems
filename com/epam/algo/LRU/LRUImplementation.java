package com.epam.algo.LRU;

import java.util.LinkedHashMap;

/**
 * @author Akansh_Rai
 * @category Implement Least Recently Used.
 *
 */
public class LRUImplementation<K, V> extends LinkedHashMap<K, V> {

	private static final long serialVersionUID = 1L;
	private int capacity;

	public LRUImplementation(int size) {
		super(size, 1.0f, true);
		this.capacity = size;
	}

	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
		return this.capacity < this.size();
	}

	public static void main(String[] args) {
		LRUImplementation<Integer, Integer> lru = new LRUImplementation<>(3);
		lru.put(1, 1);
		lru.put(2, 2);
		lru.put(3, 2);
		lru.get(2);
		lru.get(1);
		lru.put(4, 2);
		lru.put(5, 2);
		System.out.println("size  " + lru.size());
		lru.entrySet().stream().forEach((i) -> System.out.print(" " + i.getKey()));
	}
}
