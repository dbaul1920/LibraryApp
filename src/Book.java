
public class Book {
	public String author;	
	public String title;
	public boolean status;
	int counter = 0; //counts the number of books checked out

	//constructor
		public Book(String a,String t, boolean s){
			author = a;
			title = t;
			status = s;
			counter++;
			
		}
		
	public String getAuthor() {
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