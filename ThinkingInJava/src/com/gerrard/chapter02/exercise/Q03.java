package com.gerrard.chapter02.exercise;

public class Q03 {
	
	public static void main(String[] args) {
		ATypeName a = new ATypeName();
		a.say();
	}

	static class ATypeName{
		void say(){
			System.out.println("Hello!");
		}
	}
}