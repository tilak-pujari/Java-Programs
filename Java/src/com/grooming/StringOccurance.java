package com.grooming;

import java.util.Scanner;

public class StringOccurance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		System.out.println("Enter the char to check in String!");
		char ch=sc.next().charAt(0);
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch2=s.charAt(i);
			if(ch2==ch) {
				count++;
			}
		}
		System.out.println("Number of character "+ch+" in String "+s+" is:"+count);
	}

}
