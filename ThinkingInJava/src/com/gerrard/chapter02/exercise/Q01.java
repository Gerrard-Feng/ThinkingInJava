package com.gerrard.chapter02.exercise;

public class Q01 {

	public static void main(String[] args) {
		Test test = new Test();
		int a = test.a;
		char b = test.b;
		System.out.println(a);
		System.out.println(b);
	}

	static class Test {
		int a;
		char b;
	}
}