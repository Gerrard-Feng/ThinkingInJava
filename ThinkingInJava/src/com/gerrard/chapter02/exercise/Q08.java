package com.gerrard.chapter02.exercise;

public class Q08 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		StaticTest staticTest1 = new StaticTest();
		StaticTest staticTest2 = new StaticTest();
		staticTest1.a = 1;
		staticTest2.a = 2;
		staticTest1.b = new Object();
		staticTest2.b = new Object();
		staticTest1.c = 1;
		staticTest2.c = 2;
		staticTest1.d = new Object();
		staticTest2.d = new Object();
		System.out.println(staticTest1.a == staticTest2.a);
		System.out.println(staticTest1.b == staticTest2.b);
		System.out.println(staticTest1.c == staticTest2.c);
		System.out.println(staticTest1.d == staticTest2.d);
	}

	static class StaticTest {
		int a;
		Object b;
		static int c;
		static Object d;
	}
}