package Polymorphism;

class soundAnimal { 
	public void Sound() { 
		System.out.println("Different sounds of animal"); 
	}
} 
class buffalo extends soundAnimal { 
	public void Sound() { 
		System.out.println("The buffalo sound- mhoo,mhoo"); 
	} 
} 
class snake extends soundAnimal { 
	public void Sound() { 
		System.out.println("The snake sound- iss,iss"); 
	} 
} 
class tiger extends soundAnimal { 
	public void Sound() { 
		System.out.println("The tiger sounds- rrro, rrro"); 
	} 
} 
public class AnimalSound {
	public static void main(String[] args) { 
		soundAnimal Animal = new soundAnimal(); soundAnimal buffalo = new buffalo(); 
		soundAnimal snake = new snake(); 
		soundAnimal tiger = new tiger(); 
		Animal.Sound(); 
		buffalo.Sound();
		snake.Sound(); 
		tiger.Sound(); 
	} 
} 