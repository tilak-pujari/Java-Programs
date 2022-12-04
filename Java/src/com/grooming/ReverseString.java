package com.grooming;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name");
		String s=sc.nextLine();
		String reverse="";
		for(int i=s.length()-1;i>=0;--i) {
			char ch=s.charAt(i);
			reverse+=ch;
		}
		System.out.println(reverse);
		
		if(reverse.equals(s)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}

}
