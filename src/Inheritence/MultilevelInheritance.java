package Inheritence;
 
class BabyDog extends Dog{  
	void weep(){
		System.out.println("weeping");
	}  
}  

public class MultilevelInheritance {
	public static void main(String args[]){  
		BabyDog d=new BabyDog();  
		d.weep();  
		d.bark();  
		d.eat();  
	}
}  