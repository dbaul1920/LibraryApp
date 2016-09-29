import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryApp {
	
	//Declare variables
	static String author; 
	static String title;
	static boolean status = true;
	//boolean proceed = true;
	
	
	public static void main(String[] args) {
		// Welcome Message
		System.out.println("Welcome to the Grand Circus Library");
		
		//Create scanner
		Scanner input = new Scanner(System.in);
		//Ask user if they want to see a list of books
				System.out.println("Display book titles? (y/n): ");
				String search= input.next();
				
		Array[] books = new Array[12];

		String[] list = { "author", "title", "status" };
		

		/*String[] arrayName = { "J.K Rowling", "Kevin Lies", "Jojo Moyes", "Melisa Kirsch", "David Zinczenko",
				"Gina Homolka", "Amelia Freer", "Simon Sinek", "Malcolm Gladwell", "Barbara Ehrenreich",
				"Eric Schllosser", "E.L. James" };

		String[] arrayTitle = { "Very Good Lives", "Make it Happen", "One Plus One", "The Girl's Guide",
				"Men, Love, Sex", "The Skinny Taste Cookbook", "Eat.Nourish.Glow", "Leaders Eat Last",
				"The Tipping Point", "Nickel and Dimed", "Fast Food Nation", "Fifty Shade Trilogy" };
*/
		
		ArrayList<String> author = new ArrayList<String>();
		author.add("J.K Rowling");
		author.add("Kevin Lies");
		author.add("Jojo Moyes");
		author.add("Melissa Kirsch");
		author.add("David Zinczenko");
		author.add("Gina Homolka");
		author.add("Amelia Freer");
		author.add("Simon Sinek");
		author.add("Malcolm Gladwell");
		author.add("Barbara Ehrenreich");
		author.add("Eric Schllosser");
		author.add("E.L  James");

		ArrayList<String> title = new ArrayList<String>();
		title.add("Very Good Lives ");
		title.add("Make It Happen ");
		title.add("One Plus One");
		title.add("The Girls Guide ");
		title.add(" Men.Love.Sex");
		title.add("The Skinny Taste Cookbook" );
		title.add("Eat.Nourish.Glow");
		title.add("Leaders Eat Last");
		title.add("The Tipping Point");
		title.add("Nickel and Dimed");
		title.add("Fast Food Nation");
		title.add("Fifty Shade Trilogy");

		ArrayList<String> status = new ArrayList<String>();
		status.add("October 17, 2016");
		status.add("October 17, 2016");
		status.add("October 17, 2016");
		status.add("October 17, 2016");
		status.add("October 17, 2016");
		status.add("October 17, 2016");
		status.add("October 17, 2016");
		status.add("October 17, 2016");
		status.add("October 17, 2016");
		status.add("October 17, 2016");
		status.add("October 17, 2016");
		status.add("October 17, 2016");
		
		
		//Ask user to enter a title or author 
		System.out.println("Search by title or author: ");
		input = input.next();
		Book book = new Book(title, author, status);
		
		//Checks status of book (in or out)
		while(true){
			System.out.println("Book is checked out. Enter another selection: ");
			input = input.next();
			
			if(status == in){
				System.out.println("The book is due October 17th.");
			}
			
			//Return book 
			System.out.println("Would you like to return the book? (y/n): ");
			input = input.next();
			
			if(status.equalsIgnoreCase("y")){
				proceed = true;	
				
			}else{
				
				proceed= false;
				System.out.println("You checked out " + book.getObjectCount() +  Books);
				System.out.println("Thanks");
			}
			
		
			
		}
		
		
	

		
		

		
		
		
		

	}// end of main method

}// end of LibraryApp class
