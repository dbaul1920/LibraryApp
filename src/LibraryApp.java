import java.util.Scanner;

public class LibraryApp {
	
	//Declare variables
	String author; 
	String title;
	boolean status = true;
	boolean proceed = true;
	
	
	public static void main(String[] args) {
		// Welcome Message
		System.out.println("Welcome to the Grand Circus Library");
		
		//Create scanner
		Scanner input = new Scanner(System.in);
		
		//Ask user if they want to see a list of books
		System.out.println("Display book titles? (y/n): ");
		input = input.NextLine();
		
		//Ask user to enter a title or author 
		System.out.println("Search by title or author: ");
		input = input.NextLine();
		
		//Checks status of book (in or out)
		while(true){
			System.out.println("Book is checked out. Enter another selection: ");
			input = input.NextLine();
			
			if(status == in){
				System.out.println("The book is due October 17th.");
			}
			
			//Return book 
			System.out.println("Would you like to return the book? (y/n): ");
			input = input.NextLine();
			
			if(status.equalsIgnoreCase("y")){
				proceed = true;	
				
			}else{
				
				proceed= false;
				System.out.println("You checked out " + book.getObjectCount() +  Books);
				System.out.println("Thanks");
			}
			
		sysout
			
		}
		
		
	

		
		

		
		
		
		

	}

}
