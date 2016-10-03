import java.util.ArrayList;
import java.util.Scanner;

public class BookArray {
static Scanner input = new Scanner(System.in);

	public static ArrayList<Books> books(){
	// Create Array with Author, Title, Status
		 boolean reservedTitle = true;
		 boolean reservedAuthor = true;
		 int total = 0;
		 boolean proceed = true;
		 String cont;
		 
	while(proceed){
		
			//Creates arraylist for book object
			ArrayList<Books> books = new ArrayList<Books>();

			books.add(new Books("J.K Rowling", "Very Good Lives", true));
			books.add(new Books("Kevin Liles",  "Make It Happen", true));
			books.add(new Books("Jojo Moyes",   "One Plus One", false ));
			books.add(new Books("Melisa",        "The Girls Guide ", true));
			books.add(new Books("David Zinczenko", "Men, Love, Sex", false));
			books.add(new Books("Gina Homolka",    "Skinny Cookbook", false));
			books.add(new Books("Amelia Freer",    "Eat.Nourish.Glow", true));
			books.add(new Books("Simon Sinek",     "Leaders Eat Last", true));
			books.add(new Books("Malcolm Gladwell", "Tipping Point", true));
			books.add(new Books("Barbara Ehrenreich  ", "Nickel & Dimed", false));
			books.add(new Books("Eric Schlloser", "Fast Food", false));
			books.add(new Books("E.L James", "50 Shade Trilogy", false));
			
			for(Books book: books){
				
				System.out.println(book.getTitle() + "\t  " + "\t  " + "\t" + book.getAuthor());
				
			}
			
			for(Books book: books){
				reservedTitle = books.contains(book.getTitle() + "\t");
			}
			
			for(Books book: books){
				reservedAuthor = books.contains(book.getAuthor());
			}
			
			if(reservedTitle){
				System.out.println("This book has now been reserved");
				total++;
			}else if(reservedAuthor){
				System.out.println("This book has now been reserved");
				total++;
			}else{
				//System.out.println("This book is available for check out");
				total++;	
			}
			
			//Test
			for(Books book : books) {
				  if(books.equals(book.getTitle())) {
				    book.setCheckedOut(true);
				    break; // found the book, break out of the loop
				  }
				}
			
			System.out.println();
			System.out.println("Would you like to reserve a book? (enter y/n)");
			cont = input.nextLine();
			
			if(cont.equalsIgnoreCase("y")){
				proceed = true;
			}else{
				proceed = false;
				System.exit(0);
			}
			BookMethods.chooseAuthorOrTitle();
			System.out.println("You checked out " + total + " book");	
	}
	return null;		
			
	}
	
			
}
