package com;

public class Faltu implements Person {

	@Override
	public void eat() {
		System.out.println("Eating Jalebi");
	}
	public static void main(String[] args) {
		
		System.out.println(Person.id);
		Faltu f = new Faltu();
		f.eat();
	}
}
