package com.rs.zensar;

class Pair<T, S> {
	public T first;
	public S second;
}

public class GenericDemo {

	public static void main(String[] args) {

		Pair<Integer, String> p = new Pair();

		int i = 4;
		Integer j = new Integer(4);
		Integer k = 4;

		int x = j;

	}

}


