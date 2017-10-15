/**
 * GuessingGame.java
 * Michael Wang
 * ID: mwang98
 * Program simulates guessing game where user is given three chances
 * to correctly guess a random number from 1-10. Everytime the user
 * incorrectly guesses the number, the program will inform the user 
 * whether the numbers guessed is too high or too low. If the user wins,
 * the user will be notified of how many tries it took to win.
 * 
 */
import java.util.Scanner;

public class GuessingGame {
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in); //create new Scanner object
		int num = (int) Math.ceil(Math.random() *10);// creates number to be guessed from 1-10
		//System.out.println(num); // testing
		String name = ""; // declare and initiate name to empty string
		int user = 0;// declare and initiate user to 0
		int tries = 1;// declare and initiate tries to 0
		boolean correct = false;// declare and initiate correct to 0
		System.out.println("Welcome to the number guessing game. What is your name?");// prompts for user name
		name = in.next();
		System.out.println("\n" + "I'm thinking of an integer between 1 and 10. You have 3 guesses.");
		System.out.println("\n" + "Your first guess: ");// prompts for first guess
		user = in.nextInt();
		while(tries<= 3 && correct == false) {// while loop checks to make sure user gets only 3 tries and if user correctly guessed number
			if(user > num) {// if guess is higher than the correct number
				if( correct == false && tries < 3) { // prints out hint when guess is incorrect and not the user's last try
					System.out.println("Too high, guess lower.");
				}
				tries++;// increment tries
				if(tries == 2) {
					System.out.println("\n" + "Your second guess: ");// prompt for second guess
					user = in.nextInt();
				}
				else if(tries == 3) {
					System.out.println("\n" + "Your third guess: ");// prompt for third guess
					user = in.nextInt();
				}
			}
			else if(user < num) {
				if(correct == false && tries < 3) {// prints out hint when guess is incorrect and not the user's last try
					System.out.println("Too low, guess higher.");
				}
				tries++;
				if(tries == 2) {
					System.out.println("\n" + "Your second guess: ");// prompt for second guess
					user = in.nextInt();
				}
				else if(tries == 3) {
					System.out.println("\n" + "Your third guess: ");// prompt for third guess
					user = in.nextInt();
				}
			}
			else if(user == num){
				System.out.println("Congratulations " + name + "! You won in " + tries + " guesses.");// Displays message giving name and tries if user correctly guesses number
				correct = true;// leave while loop
			}
			
		}
		
		if(correct == false){
			System.out.println("\n" + "Game over " + name + ", you lose.");// Displays message if user loses
		}
	}
}
