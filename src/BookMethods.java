import java.util.Scanner;

public class BookMethods {
	//DeclaredVariables
	public static String author;
	public static String title; 
	
static Scanner sc = new Scanner(System.in);

//Asks user to search by author or title
public static void chooseAuthorOrTitle(){
	
	System.out.println("Would you like to search by author or title? (enter author/title)");
	String option = sc.nextLine();
	
//If statement to prompt user to enter author or title based on input
	if(option.equalsIgnoreCase("author")){
		
		System.out.println("Please enter author name: ");
		author = sc.nextLine();
		
		}else{
			System.out.println("Please enter title:");
			title = sc.nextLine();
		}
	}
	
//Checks to make sure book is not already checked out
public void checkOut(){

	boolean checkedOut = false;
	
	if (checkedOut == true)
		System.out.println("Error: " + title + " is already checked out \n");
	else
	{
		checkedOut = true;
			System.out.println("Already checked out ");
		}
	}
	
	// Checks to see if book is already checked out

}
	


