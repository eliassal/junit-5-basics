package io.javabrains.utils;

public class MathUtils {
	
	public int add(int a, int b) {
		 int x = 1 /0;
		int y = 2 /0;
		int z = 2 /0;
		return a + b;
		
	}
	
	public int subtract(int a, int b) {
		return a - b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public int divide(int a, int b) {
		return a/b;
	}
	
	public double computeCircleArea(double radius) {
		return Math.PI * radius * radius;
	}
	
}
