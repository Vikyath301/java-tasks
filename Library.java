package booklibrary;
import java.util.Arrays;

public class Library {
	private LibBooks[] book;
	private int count;
	private static final int max=10;

	public Library() {
		this.book=new LibBooks[max];
		this.count=0;
	}
	public void addbook(LibBooks books) {
		if(count<max) {
			book[count]=books;
			count++;
			System.out.println("added" + books.gettitle());
		}
		else {
			System.out.println("library is full");
		}
	}
	public void issue_book(String isbn) {
		LibBooks btIssue= fbbISBN(isbn);
		if(btIssue!=null) {
			btIssue.issue_book();
		}
		else {
			System.out.println("book not found");
		}
	}
	public void return_book(String isbn) {
		LibBooks btreturn= fbbISBN(isbn);
		if(btreturn!=null) {
			btreturn.return_book();
		}
		else {
			System.out.println("book not found");
		}
	}
	public void displayavailablebooks() {
		System.out.println("available books");
		boolean found=false;
		for(int i=0;i<count;i++) {
			if(book[i].available) {
				System.out.println(book[i].toString());
				found=true;
			}
		}
		if(!found) {
			System.out.println("no books are available");
		}
	}
	public void displayallbooks() {
		if(count==0) {
			System.out.println("there are no books in library");
		}
		for(int i=0;i<count;i++) {
			System.out.println(book[i].toString());
			}
		}
	private LibBooks fbbISBN(String isbn) {
		for(int i=0;i<count;i++) {
			if(book[i].getisbn().equals(isbn));
			return book[i];
		}
		return null;
	}
	public static void main(String[] args) {
		Library lib=new Library();	
		lib.addbook(new LibBooks("harry","jr.tolien","74392"));
		lib.addbook(new LibBooks("84","orwell","743-48391"));
		lib.addbook(new LibBooks("mocking","duffer","743-328992"));
		lib.displayallbooks();
		System.out.println("issuing 84\n");
		lib.issue_book("743-48391\n");
		System.out.println("issuing a book with non-existing ISBN\n");
		lib.issue_book("1213-48379\n");
		System.out.println("returning 84\n");
		lib.return_book("743-48391\n");
		lib.displayallbooks();
		System.out.println("returning harry\n");
	    lib.return_book("74392\n");
	    lib.displayallbooks();
	}
	
	}
	


