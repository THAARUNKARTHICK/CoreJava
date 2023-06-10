package Inheritence;

public class Employee {
	int salary = 40000;
}
class Developer extends Employee{
	int bonus = 10000;
	int total = salary + bonus;
	public static void main(String []args) {
		Developer p = new Developer();
		System.out.println("Programmer salary is: "+p.salary);
		System.out.println("Bonus of programmer i: "+p.bonus);
		System.out.println("The Total salary take home is: "+p.total);		
	}
}
