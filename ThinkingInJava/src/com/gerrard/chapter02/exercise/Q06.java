package com.gerrard.chapter02.exercise;

public class Q06 {

	public static void main(String[] args) {
		String str = "abcd";
		System.out.println(storage(str));
	}

	private static int storage(String str) {
		return str.length() * 2;
	}
}