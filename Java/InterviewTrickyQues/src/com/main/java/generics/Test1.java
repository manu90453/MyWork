package com.main.java.generics;

import java.util.ArrayList;
import java.util.List;

class Animal {
	public Animal() {
		
	}
	
	public String toString() {
		return "Animal Class";
	}
}

class Dog extends Animal{
	public Dog() {
		
	}
	
	public String toString() {
		return "Dog Class";
	}
}

public class Test1 {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Dog dog = new Dog();
		
		List<Animal> list = new ArrayList<Animal>();
		list.add(dog);
		list.add(animal);
		
		List<Dog> myList = new ArrayList<Dog>();
		try {	
			myList.add((Dog)animal);
		} catch(ClassCastException ex) {
			System.out.println("Exception caught:  " + ex.getMessage());
		}
	
		
		System.out.println(" List : " + list);
		if (true)
			//Checking
			System.out.println(" MyList: " + myList);
	}
}
