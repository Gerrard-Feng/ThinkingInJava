package com.gerrard.chapter02.exercise;

public class Q07 {
	
	public static void main(String[] args) {
		Incrementable.increment();
		System.out.println(StaticTest.i);
	}

	static class Incrementable {
		static void increment() {
			StaticTest.i++;
		}
	}

	static class StaticTest {
		static int i = 47;
	}
}