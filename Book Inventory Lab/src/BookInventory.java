
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
	
	//adds the number of new copies to stock
	public void addInventory(int addedBooks){
		stock+=addedBooks;
	}
	
	//subtracts amount of books sold from stock 
	public void sellInventory(int soldBooks){
		stock-=soldBooks;
	}
	
	//updates both the rating and the number of ratings
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
	
	//updates price. If new price is more than a 25% difference form the previous price, 
	//it saves the new value but prints a warning as well
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