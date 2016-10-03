public class Books {
	
public String author;
public String title;
boolean status;
int count = 0; //counts the number of books checked out
/**
 * @param b 
 * @return the author
 */

	//constructor
public Books(String a,String t, boolean b){
			author = a;
			title = t;	
		}
	
public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public String getTitle() {
	return title;
}

public boolean isStatus() {
	return status;
}


public boolean getStatus() {
	return status;
}

public void setStatus(boolean status) {
	this.status = status;
}
public static int getObjectCount() {
	// TODO Auto-generated method stub
	return 0;
}

public void setCheckedOut(boolean b) {
	// TODO Auto-generated method stub
	
}

//public String toString () {
//	return books;


//}


	//public void setTitle(String title) {
	//.title = title;
	//}

	//public void setStatus(boolean status) {
		//this.status = status;
	//}

	

}