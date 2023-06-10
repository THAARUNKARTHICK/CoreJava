package Encapsulation;


public class TestAuthor {
	   public static void main(String[] args) {
	      // Test constructor and toString()
	      Author ahTeck = new Author("Thaarunkarthick", "thaarunkarthick@gmail.com", 'm');
	      System.out.println(ahTeck);  // toString()

	      ahTeck.setEmail("thaarunkarthick@gmail.com");
	      System.out.println(ahTeck); 
	      System.out.println("name is: " + ahTeck.getName());
	      System.out.println("gender is: " + ahTeck.getGender());
	      System.out.println("email is: " + ahTeck.getEmail());
	   }
}