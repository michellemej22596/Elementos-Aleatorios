package main;
import java.util.ArrayList;
import java.util.HashMap;
import models.Dog;
import models.Stack;

public class main {

	public static void main(String[] args) {
		
		// Stack insertion
		Stack<Dog> stack = new Stack<Dog>();
		for(int i =1; i<=100; i++) {
			int number= (int) Math.random();
			Dog dog = new Dog(number);
			stack.push(dog);
		}
		
		// Array insertion
		ArrayList<Dog> array = new ArrayList<Dog>();
		for(int i =1; i<=100; i++) {
			int number= (int) Math.random();
			Dog dog = new Dog(number);
			array.add(dog);
		}
		
		// HashMap insertion
		HashMap<Integer, Dog> hashMap = new HashMap<Integer, Dog>();
		for(int i =1; i<=100; i++) {
			int number= (int) Math.random();
			Dog dog = new Dog(number);
			hashMap.put(number, dog);
		}
		
	}

}
