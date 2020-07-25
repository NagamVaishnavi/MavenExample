package com.newyear.gifts;

public class Chocolate {
	public int totalWeight(int chocy[],int n)
	{
		int total=0;
		for(int i=0;i<n;i++)
		{
			total+=chocy[i];
		}
		return (total);
	}
	public int totalCandies(int min,int max,int chocy[],int c)
	{
		int count=0;
		for(int i=0;i<c;i++)
		{
			if(chocy[i]>=min && chocy[i]<=max)
				count+=1;
		}
		return (count);
	}
}
