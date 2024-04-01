package com.test.file;

public class Test1 {

	public static void main(String[] args) {
		Pair<String, Integer> pair = PairFactory.generatePair("One", 1);
		pair.show();
	}
}

class Pair<K, V> {
	private K key;
	private V value;
	
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
	
	public void show() {
		System.out.printf("Key = %s, Value = %d", this.key, this.value);
	}
}

class PairFactory {
	public static <K extends CharSequence, V extends Number> Pair<K, V> generatePair(K key, V value) {
		return new Pair<>(key, value);
	}
}
