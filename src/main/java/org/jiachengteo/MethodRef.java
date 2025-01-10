package org.jiachengteo;

import java.util.stream.Stream;

// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MethodRef {
	public static void main(String[] args) {
		Stream.of(1, 2, 3).forEach(MethodRef::printNumber);
	}

	public static void printNumber(int n) {
		System.out.println(n);
	}
}