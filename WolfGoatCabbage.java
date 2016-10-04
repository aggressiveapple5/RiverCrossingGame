/**
* This is a game where you have to safely get all
* three objects to the oposite river bank.
* @author Matt Keller
* @version 1.0
*/
import java.util.Scanner;
public class WolfGoatCabbage
{
	// global scope
	public static boolean cabb;
	public static boolean goat;
	public static boolean wolf;
	public static boolean human;
	public static boolean ending;

	public static void main(String[] args)
	{
		
		ending = true;
		directions();
		while (ending == true)
		{
			displayGameStatus();
			game();

			if (cabb == true && goat == true && wolf == true && human == true)
				ending = false;
				System.out.println("Wow! Good work! You win!");
		}
		
	
	
	
	
	
	
	
	
	}

	/**
	* Simple welcome message with the directions
	* of the game printed on the screen.
	* @param none
	*/
	
	public static void directions()
	{
		System.out.println("Welcome!");
		System.out.println("The goal of this game is to get all the objects to the same");
		System.out.println("side without the animals eating each other. If the goat is") ;
		System.out.println("left alone with the cabbage it will eat the cabbage and if");
		System.out.println("the goat is left alone with the wolf the wolf will eat the");
		System.out.println("goat.");
	}

	/**
	* Displays a visual representation
	* of what is going on in the game.
	* @param none
	*/
	public static void displayGameStatus()
	{
		String bank0 = "";
		String bank1 = "";
		
		if (!cabb)
			bank0 += "C ";
		else
			bank1 += "C ";
		if (!goat)
			bank0 += "G ";
		else
			bank1 += "G ";
		if (!wolf)
			bank0 += "W ";
		else
			bank1 += "W ";
			if (!human)
			bank0 += "H ";
		else
			bank1 += "H ";
			
		System.out.println(bank0);
		System.out.println("-----------------------");
		System.out.println("\n \n \n ");
		System.out.println("-----------------------");
		System.out.println(bank1);
	}

	/**
	* Contains the code for running the game
	* including the user input section
	* @param none
	*/
	public static void game()
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What would you like to move across the river? ");
		String userMove = keyboard.nextLine();
		
		if (userMove.equals("H"))
		{
			if (human)
				human = false;
			else
				human = true;
		}
		else if (userMove.equals("W"))
		{	
			if (wolf && human)
			{
				wolf = false;
				human = false;
			}
			else if (wolf == false && human == false)
				{
					wolf = true;
					human = true;
				}
			else
				System.out.println("You cannot move that as you are not on the same bank.");
		}
		
		else if (userMove.equals("C"))
		{	
			if (cabb && human)
			{
				cabb = false;
				human = false;
			}
			else if (cabb == false && human == false)
				{
					cabb = true;
					human = true;
				}
			else
				System.out.println("You cannot move that as you are not on the same bank.");
		}
		
		else if (userMove.equals("G"))
		{	
			if (goat && human)
			{
				goat = false;
				human = false;
			}
			else if (goat == false && human == false)
				{
					goat = true;
					human = true;
				}
			else
				System.out.println("You cannot move that as you are not on the same bank.");
		}
		
		if (goat == true && wolf == true && cabb == false && human == false)
		{
			System.out.println("You lose.");
			ending = false;
		}
		
		if (goat == false && wolf == false && cabb == true && human == true)
		{
			System.out.println("You lose.");
			ending = false;
		}
			
		
	
		
		if (goat == true && wolf == false && cabb == true && human == false)
		{
			System.out.println("You lose.");
			ending = false;
		}
		
		if (goat == false && wolf == true && cabb == false && human == true)
		{
			System.out.println("You lose.");
			ending = false;
		}
		
		
	
	
	
	}






}