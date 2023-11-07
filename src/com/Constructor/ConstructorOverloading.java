package com.Constructor;

public class ConstructorOverloading {

	int id;
	String name;
	int age;
	// creating two arg constructor

	public ConstructorOverloading(int i, String n) {
		// TODO Auto-generated constructor stub
		id = i;
		name = n;
	}

	ConstructorOverloading(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}

	void display() {
		System.out.println(id + " " + name + " " + age);
	}

	public static void main(String args[]) {
		ConstructorOverloading s1 = new ConstructorOverloading(111, "Karan");
		ConstructorOverloading s2 = new ConstructorOverloading(222, "Aryan", 25);
		s1.display();
		s2.display();

	}

}