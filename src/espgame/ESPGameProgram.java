/*
 * Class: CMSC203 
 * Instructor: Prof. Thai
 * Description: Test the user's extrasensory perception (ESP).
 * Due: 09/20/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
 * independently. I have not copied the code from a student or   
 * any source. I have not given my code to any student.
 * Student's Name: Stas Litvak
*/

package espgame;
import java.util.Scanner;
import java.util.Random;
import java.io.*;
public class ESPGameProgram {
		
	public static void main(String[] args) throws IOException {
		
		Scanner keyboard = new Scanner(System.in);
		String userColorChoice, compColorChoice;
		int correctGuesses = 0;
		Random rngNumber = new Random();
		System.out.println("CMSC203 Assignment1: Test your ESP skills!");
		
		System.out.print("Enter the filename: ");
		String fileName = keyboard.nextLine();
		Scanner inputFile = new Scanner(new File(fileName));
		System.out.println("There are sixteen colors from a file:");
		
		while (inputFile.hasNext()) 
		{
			String nextLine = inputFile.nextLine();
			System.out.println(nextLine);
		}
		
		System.out.println();
		inputFile.close();
		
		for (int count = 1; count <= 3; count++) {
			
			int selection = rngNumber.nextInt(16) + 1;
			switch(selection)
			{
			case 1: 
				compColorChoice = "Black";
				break;
			case 2: 
				compColorChoice = "White";
				break;
			case 3: 
				compColorChoice = "Gray";
				break;
			case 4: 
				compColorChoice = "Silver";
				break;
			case 5: 
				compColorChoice = "Maroon";
				break;
			case 6: 
				compColorChoice = "Red";
				break;
			case 7: 
				compColorChoice = "Purple";
				break;
			case 8: 
				compColorChoice = "Fuschia";
				break;
			case 9: 
				compColorChoice = "Green";
				break;
			case 10: 
				compColorChoice = "Lime";
				break;
			case 11: 
				compColorChoice = "Olive";
				break;
			case 12: 
				compColorChoice = "Yellow";
				break;
			case 13: 
				compColorChoice = "Navy";
				break;
			case 14: 
				compColorChoice = "Blue";
				break;
			case 15: 
				compColorChoice = "Teal";
				break;
			case 16: 
				compColorChoice = "Aqua";
				break;
			default: 
				compColorChoice = "Invalid Random Number";
			}
		System.out.println("Round " + count + "\n");
		System.out.println("I am thinking of a color.");
		System.out.println("Is it one of list of colors above?");
		System.out.println("Enter your guess:");
		userColorChoice = keyboard.nextLine();
		if (userColorChoice.equalsIgnoreCase(compColorChoice)) 
			correctGuesses++;
		System.out.println("\nI was thinking of " + compColorChoice + ".");
		}
		String studentName, description, dueDate;
		System.out.println("Game Over");
		System.out.println("You guessed " + correctGuesses + " out of 3 colors correctly.");
		System.out.println("Enter your name: ");
		studentName = keyboard.nextLine();
		System.out.println("Describe yourself: ");
		description = keyboard.nextLine();
		System.out.println("Due Date: ");
		dueDate = keyboard.nextLine();
		System.out.println("User Name: " + studentName);
		System.out.println("User Description: " + description);
		System.out.println("Due Date: " + dueDate);
	}		
}
