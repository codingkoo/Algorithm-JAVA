package data_structure.list.linkedList;

import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		LinkedList numbers = new LinkedList();
		numbers.addFirst(30);
		numbers.addFirst(20);
		numbers.addFirst(10);
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.add(2, 25);
		numbers.add(6, 35);
		numbers.removeFirst();
		numbers.remove(4);
		System.out.println(numbers);
		System.out.println(numbers.get(2));
		System.out.println(numbers.indexOf(25));
		System.out.println(numbers.indexOf(75));
	}
}
