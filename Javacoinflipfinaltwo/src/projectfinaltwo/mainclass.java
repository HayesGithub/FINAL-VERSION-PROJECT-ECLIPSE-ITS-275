package projectfinaltwo;

public class mainclass extends coinflipbody {
	
	//mainclass extends to coinflipbody and inherits all data and methods from the coinflipbody class
	
	public static void main (String []args) {	
		//main method used to compile our program


		System.out.println("Welcome to Double or Nothing!\n");
		//displays to the user "Welcome to Double or Nothing!" using system.out.println

		coinflipbody.menudisplay();
		//Constructor access static method menudisplay() from "coinflipbody" class

		aAbstractexample aAbstractexampleObject = new Abstractexample();
		//Creates new object from the aAbstractexample class
		aAbstractexampleObject.enjoy();
		//demonstrates abstract classes and how I can pull information from them in the main class using objects
	}

}