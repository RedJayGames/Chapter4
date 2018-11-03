public class BookInventory {
	//declare instance variable
	private String title;
	private double price;
	private int pages;
	private int copies;
	private double ratings;
	private double aveRating;


	//constructor
	public BookInventory(String t, double p, int pgs, int c, double  r, double aver ) {
		title = t;
		price = p;
		pages = pgs;
		copies = c;
		ratings = r;
		aveRating = aver;

	}
	public BookInventory(String t, double p, int pgs){
		title = t;
		price = p;
		pages = pgs;
	}
	public void addInventory (int newCopies)
	{
		copies=copies + newCopies;
	}
	public void sellInventory (int soldCopies)
	{
		copies =copies - soldCopies;
	}
	public void updateRating (int updateRating)
	{
		aveRating= (aveRating * ratings + updateRating) / (ratings + 1);
		ratings++;
	}
	public String getTitle ()
	{
		return title;
	}
	public double getPrice ()
	{
		return price;
	}
	public int getCopies ()
	{
		return copies;
	}
	public double getAveRating ()
	{
		return aveRating;
	}
	public void updateTitle (String setTitle)
	{
		title=setTitle;
	}
	public void updatePages (int setPages)
	{
		pages = setPages;
	}
	public void updatePrice (int setPrice)
	{
		if ( setPrice <= .75 * price) { 
			System.out.println("a warning to you, user");
		}
		else if (setPrice >= 1.25 * price) {
			System.out.println("a warning to you, user");
		}

		price=setPrice;
	}

	//
	// void: in every method, make variable type void or make return statement 
	public String toString()
	{
		return "Title: " + title + "\tPrice: " + price + "\tPages: " + pages + "\tCopies: " + copies
				+ "\tAverage Rating: " + aveRating; 
	}
	}