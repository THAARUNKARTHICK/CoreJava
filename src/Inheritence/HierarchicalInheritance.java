package Inheritence;

class Cat extends Animal{  
	void meow(){
		System.out.println("meowing");
	}  
}  
public class HierarchicalInheritance {  
	public static void main(String args[]){  
		Cat c=new Cat();  
		c.meow();  
		c.eat();  
		//c.bark();//We might get Compile.Time.Error  
	}
}  