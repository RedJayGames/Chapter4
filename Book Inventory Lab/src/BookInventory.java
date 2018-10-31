
public class BookInventory {

	private String bookTitle;
	private double price, rating;
	private int pageNum, stock, ratingsNum;

	public BookInventory(String bookTitle, double price, int pageNum, int stock, int ratingsNum, double rating){
		this.bookTitle = bookTitle;
		this.price = price;
		this.pageNum = pageNum;
		this.stock = stock;
		this.ratingsNum = ratingsNum;
		this.rating = rating;
	}
	
	public BookInventory(String bookTitle, double price, int pageNum){
		this.bookTitle = bookTitle;
		this.price = price;
		this.pageNum = pageNum;
		this.stock = 0;
		this.ratingsNum = 0;
		this.rating = 1;
	}
	
	public void addInventory(int addedBooks){
		stock+=addedBooks;
	}
	
	public void sellInventory(int soldBooks){
		stock-=soldBooks;
	}
	
	public void updateRating(int newRating){
		rating = (rating * ratingsNum + newRating) / (ratingsNum + 1);
		ratingsNum++;
	}
	
	public String getBookTitle(){
		return bookTitle;
	}
	
	public double getPrice(){
		return price;
	}
	
	public int getPageNum(){
		return pageNum;
	}
	
	public int getStock(){
		return stock;
	}
	
	public int getRatingsNum(){
		return ratingsNum;
	}
	
	public double getRating(){
		return rating;
	}
	
	public void setBookTitle(String newBookTitle){
		bookTitle = newBookTitle;
	}
	
	public void setPageNum(int newPageNum){
		pageNum = newPageNum;
	}
	
	public void setPrice(double newPrice){
		if(Math.abs(1 - (newPrice / price)) >= 0.25){
			System.out.println("Warning: You have saved a new price with a change of more than 25%.");
		}
		price = newPrice;
	}

	public String toString(){
		return "Title: " + bookTitle + "\tNumber of Pages: " + 
				pageNum + "\tPrice: " + price + "\tRating: " + rating + "\tNumber of Ratings: " 
				+ ratingsNum + "\tCopies in Stock: " + stock;
	}
}
