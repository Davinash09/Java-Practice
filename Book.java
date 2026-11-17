package Constructor;

public class Book {
	int Bookid;
	String title;
	String author;
	int price;
	
	public Book() {
		this.Bookid = 101;
		this.title = "Java programming";
		this.author = "James Gosling";
		this.price = 650;
	}
	public void display() {
		System.out.println("Book ID: "+Bookid);
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("Price: "+price);
	}
	public static void main(String[] args) {
		Book b = new Book();
		b.display();
	}
}
