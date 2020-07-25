package com.newyear.gifts;

public class Sweet extends Ranges{
	public int totalWeight(int sweets[],int n)
	{
		int total=0;
		for(int i=0;i<n;i++)
		{
			total+=sweets[i];
		}
		return (total);
	}
	public int totalCandies(int min,int max,int[] sweets,int c)
	{
		int count=0;
		for(int i=0;i<c;i++)
		{
			if(sweets[i]>=min && sweets[i]<=max)
				count++;
		}
		return count;
	}
}
