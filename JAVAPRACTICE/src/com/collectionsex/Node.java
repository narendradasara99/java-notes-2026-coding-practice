package com.collectionsex;

public class Node<K, V> {

	K key;
	V value;
	Node<K, V> next;

	Node(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

}
