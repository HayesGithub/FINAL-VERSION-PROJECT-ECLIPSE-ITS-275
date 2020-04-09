package projectfinaltwo;


import java.util.Scanner;

public class coinflipcode {
	
	static Scanner input = new Scanner(System.in);
	// create new static scanner that use's system in

	static String name;
	// String name to store input from user as "name"
	
	static int age;

	static String[] mainmenu = {"1.) Play Game", "\n2.) Rules", "\n3.) Exit Game"};
	// Array used for displaying the Game Menu options

	static int currency;
	//Static integer variable named "currency" that stores the user's current currency

	static int betchoice;
	//Static integer variable named "betchoice" used to store user choice for heads or tails

	static int betcurrency;
	//Static integer used to store the user's currency they wish to bet on the next coin flip

	public void superTest() {
		//this method is just for showing how the super keyword works and how this method overrides the other superTest() method in the coinflipbody class
		System.out.println("Welcome to Double or Nothing!");
		
	}
	

}
