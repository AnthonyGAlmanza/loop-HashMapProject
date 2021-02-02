package hashMapProject;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		ArrayList<String> questionList = new ArrayList<String>();
		questionList.add("Type a number");
		questionList.add("Type a second number");
		questionList.add("Type a third number");
		questionList.add("Type a fourth number");
		questionList.add("Type a fifth number");
		
		
		for(int i = 0; i < questionList.size(); i++) {
			System.out.println(questionList.get(i));
			numberList.add(userInput.nextInt());
			userInput.nextLine();
		}
		
		System.out.println(numberList);
		
		int sum = 0;
		
		for(int i = 0; i < numberList.size(); i++) {
			sum += numberList.get(i);
		}
		
		System.out.printf("The sum of these numbers is: %d \n", sum);

		
		int product = 1;
		
		for(int i = 0; i < numberList.size(); i++) {
			product *= numberList.get(i);
		}

		System.out.printf("The product of these numbers is: %d \n", product);
		
		
		
		int largest = 0;
		
		for(int i = 0; i < numberList.size(); i++) {
			if(largest < numberList.get(i)) {
			largest = numberList.get(i);
		}
		}
		System.out.printf("The largest of these numbers is: %d \n", largest);
		
		
		int smallest = numberList.get(0);
		
		for(int j = 0; j < numberList.size(); j++) {
			if(smallest > numberList.get(j)) {
				smallest = numberList.get(j);
			}
			
		}
		
		System.out.printf("The smallest of these numbers is: %d \n", smallest);
		
		
		
		
		
		
		
		HashMap<String, String> cars = new HashMap<String, String>();
	    cars.put("Civic", "Honda");
	    cars.put("Accord", "Honda");
	    cars.put("NSX", "Honda");
	    cars.put("BRZ", "Subaru");
	    cars.put("Impreza", "Subaru");
	    cars.put("Supra", "Toyota");
	    System.out.println(cars);
		

		System.out.println("What model of car are you looking for?");
		
		String model = userInput.nextLine();
		
		
		String make = cars.get(model);
		if (cars.containsKey(model)) {
			System.out.printf("Oh you are looking for a %s? ", model);
			System.out.printf("Our %s stock is over here.", make);

		} else {
			System.out.println("Oh we don't got any of those 'round here.");
		}
		
		userInput.close();


		
		
		
		
		}

	}

