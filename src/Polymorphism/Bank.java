package Polymorphism;

class HDFC extends Bank{  
	float getRateOfInterest(){
		return 9.4f;
	}  
}  
class SBI extends Bank{  
	float getRateOfInterest(){
		return 7.3f;
	}  
}  
class AXIS extends Bank{  
	float getRateOfInterest(){
		return 8.7f;
	}  
}  
  
public class Bank {
	float getRateOfInterest(){
		return 0;
	}    
	public static void main(String args[]){  
		Bank b;  
		b=new HDFC();  
		System.out.println("HDFC Rate of Interest: "+b.getRateOfInterest());  
		b=new SBI();  
		System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());  
		b=new AXIS();  
		System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());  
	}  
}  