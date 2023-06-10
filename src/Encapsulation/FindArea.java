package Encapsulation;


class Area {

	  // fields to calculate area
	  int length;
	  int breadth;

	  // constructor to initialize values
	  Area(int length, int breadth) {
	    this.length = length;
	    this.breadth = breadth;
	  }

	  // method to calculate area
	  public void getArea() {
	    int area = length * breadth;
	    System.out.println("Area: " + area);
	  }
}

public class FindArea {
	  public static void main(String[] args) {
	    // create object of Area
	    // pass value of length and breadth
	    Area rectangle = new Area(9,5);
	    rectangle.getArea();
	  }
}