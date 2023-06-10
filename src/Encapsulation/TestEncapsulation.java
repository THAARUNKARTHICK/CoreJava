package Encapsulation;

public class TestEncapsulation { 
public static void main(String[] args) {  
    //creating instance of Account class  
    Account acc=new Account();  
    //setting values through setter methods  
    acc.setAcc_no(1234567890L);  
    acc.setName("Thaarunkarthick");  
    acc.setEmail("thaarunkarthick001@gmail.com");  
    acc.setAmount(1000000f);  
    //getting values through getter methods  
    System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());  
}  
}  