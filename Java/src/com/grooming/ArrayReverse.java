package com.grooming;

public class ArrayReverse {

	public static void main(String[] args) {


		int x[]= {10,40,34,10,25,60};
		int[] y=x;
		int temp;
		for(int i=0;i<x.length/2;i++) {
			temp=x[i];
			x[i]=y[x.length-1-i];
			y[x.length-1-i]=temp;
		}
		for(int i=0;i<x.length;i++) {
		System.out.println(y[i]);
		}
		
}
}
