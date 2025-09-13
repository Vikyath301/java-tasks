package booklibrary;

public class LibBooks extends Books implements Iissueable {
	private boolean available;

	public LibBooks(String ti, String au, String isbn) {
		super(ti, au, isbn);
		this.available=true;
	}

	@Override
	public boolean issue_book() {
		if(available) {
			available=false;
			System.out.println(gettitle() + "has issued");
			return true;
		}
		else {
			System.out.println(gettitle()+"is not available");
		    return false;
		}
	}
	@Override
	public boolean return_book() {
		if(!available) {
			available=true;
			System.out.println(gettitle()+"has been returned");
			return true;
		}
		else {
			return false;	
		}
		
	}
	public boolean available() {
		return available;
	}
	public String toString() {
		return super.toString()+"availability"+(available? "available":"issued");
	}

}
