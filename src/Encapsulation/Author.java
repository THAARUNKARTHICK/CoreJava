package Encapsulation;


public class Author {
	   // The private instance variables
	   private String name;
	   private String email;
	   private char gender;   // 'm' or 'f'
	 
	   public Author(String name, String email, char gender) {
	      this.name = name;
	      this.email = email;
	      this.gender = gender;
	   }
	 
	   // Getter and Setter
	   public String getName() {
	      return name;
	   }
	   /** Returns the gender */
	   public char getGender() {
	      return gender;
	   }
	   /** Returns the email */
	   public String getEmail() {
	      return email;
	   }
	   /** Sets the email */
	   public void setEmail(String email) {
	      this.email = email;
	   }
	 
	   /** Returns a self-descriptive String */
	   public String toString() {
	      return name + " (" + gender + ") at " + email;
	   }
	}