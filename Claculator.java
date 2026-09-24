package com.test;

public class Claculator {
	int add(int a,int b) {
		return a+b;
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		Claculator s1=new Claculator();
		System.out.println("add="+s1.add(2,4));
		System.out.println("another="+s1.add(56,78,90));
	}

}
