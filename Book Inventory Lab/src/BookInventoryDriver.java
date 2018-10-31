
public class BookInventoryDriver {
	
	public static void main(String[] args) {
		BookInventory book1 = new BookInventory("The Book of R", 9.99, 101, 7, 3, 4);
		BookInventory book2 = new BookInventory("The Book of Java", 14.99, 256, 8, 18, 4.5);
		BookInventory book3 = new BookInventory("The Book of Python", 11.99, 128);
		
		book3.addInventory(3);
		System.out.println(book3.getStock());
		book3.updateRating(4);
		book3.updateRating(3);
		book2.updateRating(5);
		book2.setPageNum(255);
		System.out.println(book1.getBookTitle());
		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book3);
	}
}
