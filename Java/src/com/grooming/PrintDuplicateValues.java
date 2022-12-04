package com.grooming;

import java.util.Scanner;

public class PrintDuplicateValues {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		s=s.toLowerCase();
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			int count=0;
			for(int j=0;j<s.length();j++) {
				char ch2=s.charAt(j);
				if(ch==ch2 && i>j) {
					break;
				}
				if(ch==ch2) {
					count++;
				}
				
			}
			if(count>1) {
				System.out.println("The character "+ch+" Present "+count+" times");
			}
		}
	}

}
