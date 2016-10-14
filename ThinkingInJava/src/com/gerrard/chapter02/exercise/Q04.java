package com.gerrard.chapter02.exercise;

public class Q04 {

	public static void main(String[] args) {
		DataOnly data = new DataOnly();
		System.out.println(data.a);
		System.out.println(data.b);
		System.out.println(data.c);
	}
	
	static class DataOnly{
		int a;
		double b;
		boolean c;
	}
}