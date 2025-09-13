package booklibrary;

public class Books {
	private String ti; //title
	private String au; //author
	private String isbn;
	Books(String ti, String au, String isbn){
		this.ti=ti;
		this.au=au;
		this.isbn=isbn;
	}
	public String gettitle() {
		return ti;
	}
	public String getauthor() {
		return au;
	}
	public String getisbn() {
		return isbn;
	}
	public String toString() {
		return "title is"+ ti +"author is"+ au+ "the ISBN is"+isbn;
	}

}
