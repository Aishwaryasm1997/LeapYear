package day_5_assignments;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int year;
  	    Scanner sc=new Scanner(System.in);
  	    System.out.print("enter  any calendar year :");
        year=sc.nextInt();	 
        
        leapOrNot(year);  
	}
	static void leapOrNot(long year)
	{
		if(year!=0)
		{
			if(year%400==0)
				System.out.println(year+" is a leap year");
			else  if(year%100==0)
				System.out.println(year+" is not a leap year");
        		else if(year%4==0)                    
        			System.out.println(year+" is a leap year");
        			else 
        				System.out.println(year+" is not a leap year");                       
		}  
		}

	}
