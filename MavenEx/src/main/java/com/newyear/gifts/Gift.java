package com.newyear.gifts;
import java.util.Scanner;

public class Gift {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number of Chocolates:");
		int noofchocos=sc.nextInt();
		System.out.print("Enter the Number of Sweets:");
		int noofsweets=sc.nextInt();
		int[] chocy=new int[noofchocos];
		int[] sweets=new int[noofsweets];
		for(int i=0;i<noofchocos;i++)
		{
			System.out.print("Enter the weight of "+(i+1)+" chocolate:");
			chocy[i]=sc.nextInt();
		}
		Chocolate c1=new Chocolate();
		int cweight=c1.totalWeight(chocy, noofchocos);
		for(int i=0;i<noofsweets;i++)
		{
			System.out.print("Enter the weight of "+(i+1)+" sweet:");
			sweets[i]=sc.nextInt();
		}
		Sweet s1=new Sweet();
		int sweight=c1.totalWeight(sweets, noofsweets);
		System.out.print("Enter the minimum weight of candies:");
		int min=sc.nextInt();
		System.out.print("Enter the maximum weight of the candies:");
		int max=sc.nextInt();
		int totalchocycandy=c1.totalCandies(min,max,chocy,noofchocos);
		int totalsweetcandy=s1.totalCandies(min,max,sweets,noofsweets);
		int totalnoofcandy=totalchocycandy+totalsweetcandy;
		if(totalnoofcandy>=1)
			System.out.print("Awe!! You recieved "+totalnoofcandy+" candies");
		else
			System.out.print("You recieved only "+totalnoofcandy+" candies");
		
		
	}
}
