package Inheritence;

import java.util.Scanner;

class Person1 {
    private String name; 
    Person1(String s) {   
          setName(s); 
    } 
    public void setName(String s) { 
      name = s; 
    } 
    public String getName(){ 
      return name; 
    } 
    public void display(){ 
      System.out.println("Name : " + name); 
    } 
}
class Staff1 extends Person1{
    private int staffId; 
    Staff1(String name,int staffId){ 
      super(name); 
      setStaffId(staffId); 
    } 
    public int getStaffId() {
        return staffId;
    }
    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }
    public void display() 
    { 
      super.display(); 
      System.out.println("Staff Id : " + staffId); 
    } 
}
class TemporaryStaff extends Staff1{
    private int days; 
    private int hoursWorked; 
    TemporaryStaff(String sname,int id,int days,int hoursWorked) {      
       super(sname,id); 
       this.days  = days; 
       this.hoursWorked = hoursWorked; 
    } 
    public int Salary()   { 
        int salary = days * hoursWorked * 50;
        
      return salary;
    } 
    public void display() 
    { 
      super.display(); 
      System.out.println("No. of Days : " + days); 
      System.out.println("No. of Hours Worked : " + hoursWorked); 
      System.out.println("Total Salary : " + Salary()); 
    } 
}

public class StaffFinder {
    public static void main(String args[])
    {
    	Scanner myObj =new Scanner(System.in);
    	String name = myObj.nextLine();
    	int staffId =Integer.parseInt(myObj.nextLine());
    	int days =Integer.parseInt(myObj.nextLine());
    	int hoursWorked =Integer.parseInt(myObj.nextLine());
        TemporaryStaff ts = new TemporaryStaff(name, staffId, days, hoursWorked);
        
        ts.display();
    }
}