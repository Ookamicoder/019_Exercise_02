package com.example.maven.calculator_erik;

public class Main {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println(calculator.addition(4, 5));
		System.out.println(calculator.subtraction(10, 4));
		System.out.println(calculator.multiplication(5, 5));
		System.out.println(calculator.division(5, 5));
	}

}
