import java.util.ArrayList;

public class Book {
	public ArrayList<String> author;	
	public ArrayList<String> title;
	public ArrayList<String> status;
	int counter = 0; //counts the number of books checked out

	//constructor
		public Book(ArrayList<String> t,ArrayList<String> a, ArrayList<String> s){
			author = t;
			title = a;
			status = s;
			counter++;
			
		}
		
	public ArrayList<String> getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	public boolean isStatus() {
		return status;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	

}