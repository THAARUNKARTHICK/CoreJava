package Encapsulation;


import java.util.Scanner;
class Bicycle 
{
    public int gear;
    public int speed;
         
    public Bicycle(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }
         
    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }
         
    public void speedUp(int increment)
    {
        speed += increment;
    }
         public String toString() 
    {
        return("No of gears are "+gear
                +"\n"
                + "speed of bicycle is "+speed);
    } 
}
 
class MountainBike extends Bicycle 
{
     
    public int seatHeight;
 
    public MountainBike(int gear,int speed,
                        int startHeight)
    {
        super(gear, speed);
        seatHeight = startHeight;
    } 
         
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    } 
     
    @Override
    public String toString()
    {
        return (super.toString()+
                "\nseat height is "+seatHeight);
    }
     
}
 
class TestBicycle
{
    public static void main(String args[]) 
    {
         int gear,speed,startHeight;
         Scanner sc=new Scanner(System.in);
         gear=sc.nextInt();
         speed=sc.nextInt();
         startHeight=sc.nextInt();
        MountainBike mb = new MountainBike(gear,speed,startHeight);
        System.out.println(mb.toString());
             
    }
}

