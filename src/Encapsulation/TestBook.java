package Encapsulation;


public class TestBook {
	   public static void main(String[] args) {
	      // We need an Author instance to create a Book instance
	      Author ahTeck = new Author("Thaarunkarthick", "thaarunkarthick@gmail.com", 'm');
	      System.out.println(ahTeck);  // Author's toString()

	      // Test Book's constructor and toString()
	      Book dummyBook = new Book("Java for Beginner", ahTeck, 499, 99);
	      System.out.println(dummyBook);  // Book's toString()

	      // Test Setters and Getters
	      dummyBook.setPrice(399);
	      dummyBook.setQty(94);
	      System.out.println("name is: " + dummyBook.getName());
	      System.out.println("price is: " + dummyBook.getPrice());
	      System.out.println("qty is: " + dummyBook.getQty());
	      System.out.println("author is: " + dummyBook.getAuthor());
	      System.out.println("author's name is: " + dummyBook.getAuthor().getName());
	      System.out.println("author's email is: " + dummyBook.getAuthor().getEmail());
	      System.out.println("author's gender is: " + dummyBook.getAuthor().getGender());
	     
	      // Using an anonymous Author instance to create a Book instance
	      Book moreDummyBook = new Book("Java for Amateurs",
	            new Author("Raj", "raj@gmail.com", 'm'), // an anonymous Author's instance
	            299, 88);
	      System.out.println(moreDummyBook);  // Book's toString()
	   }
	}