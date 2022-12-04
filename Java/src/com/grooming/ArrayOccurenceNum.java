package com.grooming;

public class ArrayOccurenceNum {

		public static void main(String[] args) {


			int x[]= {10,40,34,10,25,60};
			int[] y=x;
			int temp1,temp2;
			for(int i=0;i<x.length/2;i++)
			{
				
				temp1=x[i];
				int count=0;
				for(int j=0;j<x.length;j++)
				{
					temp2=y[j];
						
					if(temp1==temp2 && i>j) 
					{
							break;
					}
					if(temp1==temp2)
					{
							count++;
					}	
				}
				System.out.println(temp1+" present in array "+count+" times");							
			}
			
	}
}