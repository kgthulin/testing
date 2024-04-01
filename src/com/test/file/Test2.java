package com.test.file;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		Container<Integer> container = new Container<>();
		container.add(100);
		container.add(200);
		System.out.println(container.get(0));
		System.out.println(Arrays.toString(container.getAll()));
		System.out.println(container.size());
	}

}

class Container<T> {
	@SuppressWarnings("unchecked")
	private T[] array = (T[]) new Object[] {};
	
	void add(T data) {
		array = Arrays.copyOf(array, array.length + 1);
		array[array.length - 1] = data;
	}
	
	T get(int index) {
		return array[index];
	}
	
	T[] getAll() {
		return Arrays.copyOf(array, array.length);
	}
	
	int size() {
		return array.length;
	}
}
