//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		for (int i = 0; i < 11; i++) {
			
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		if (randomNumber==0) {
			System.out.println("You have a great personality!");
		}
		else if (randomNumber==1) {
			System.out.println("You are very talented!");
		}
		else if (randomNumber==2) {
			System.out.println("You look very nice today!");
		}
		else if (randomNumber==3) {
			System.out.println("I love your outfit!");
		}
		else {
			System.out.println("You have great jokes!");
		}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
		}
		}
}
