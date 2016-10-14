package com.gerrard.chapter02.exercise;

public class Q05 {

	public static void main(String[] args) {
		DataOnly data = new DataOnly();
		data.a = 2;
		data.b = 1.7;
		data.c = false;
		System.out.println(data.a);
		System.out.println(data.b);
		System.out.println(data.c);
	}

	static class DataOnly {
		int a;
		double b;
		boolean c;
	}
}