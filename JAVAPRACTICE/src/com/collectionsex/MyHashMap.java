package com.collectionsex;

public class MyHashMap<K, V> {

	public static final int size = 16;

	Node<K, V>[] buckets = new Node[size];

	private int getIndex(K key) {
		return Math.abs(key.hashCode()) % size;
	}

	public void put(K key, V value) {

	    int index = getIndex(key);

	    Node<K, V> head = buckets[index];

	    // Bucket is empty
	    if (head == null) {
	        buckets[index] = new Node<>(key, value);
	        return;
	    }

	    // Traverse linked list
	    Node<K, V> current = head;

	    while (true) {

	        // Update value if key already exists
	        if (current.key.equals(key)) {
	            current.value = value;
	            return;
	        }

	        if (current.next == null)
	            break;

	        current = current.next;
	    }

	    // Collision: add new node at end
	    current.next = new Node<>(key, value);
	}

	public V get(K key) {

		int index = getIndex(key);

		Node<K, V> current = buckets[index];

		while (current != null) {

			if (current.key.equals(key))
				return current.value;

			current = current.next;
		}

		return null;
	}

}
