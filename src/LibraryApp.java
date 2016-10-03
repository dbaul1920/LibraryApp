import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryApp {
	
	public static void main(String[] args) {

		// Create scanner
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		System.out.println("Welcome to Grand Circus Java Library");
		
		System.out.println("Display book titles? (y/n): ");
		choice = sc.nextLine();
		

		//Print out the list of books
		BookArray.books();
		 
		//Calls method to inform user book is available
		BookMethods.chooseAuthorOrTitle();
		System.out.println("Book is available.");
	
		//Asks user if they want to continue
		System.out.println("Continue? (y/n)");
		choice = sc.nextLine();

		System.out.println("Good Bye!");
		sc.close();//close scanner
	
	  } 

	}// end main	
// end class
	

