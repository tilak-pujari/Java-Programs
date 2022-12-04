package com.grooming;

import java.util.Scanner;

public class WordSwap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		//s=s.toLowerCase();
		String str[]=s.split(" ");
		
		String temp=str[0];
		str[0]=str[str.length-1];
		str[str.length-1]=temp;
		
		String result="";
		for(String s1:str) {
			result=result+s1+" ";
		}
		System.out.println(result);
	}

}
