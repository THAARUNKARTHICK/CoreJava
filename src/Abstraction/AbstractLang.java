package Abstraction;

abstract class Language {

	  // method of abstract class
	  public void display() {
	    System.out.println("This is Java Programming");
	  }
	}

public class AbstractLang extends Language{

	  public static void main(String[] args) {
	    
	    // create an object of Main
	    AbstractLang obj = new AbstractLang();

	    // access method of abstract class
	    // using object of Main class
	    obj.display();
	  }
	}