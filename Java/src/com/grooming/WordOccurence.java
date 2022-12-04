package com.grooming;

import java.util.Scanner;

public class WordOccurence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		s=s.toLowerCase();
		String str[]=s.split(" ");
		
		for(int i=0;i<str.length;i++) {
			String s1=str[i];
			int count=0;
			for(int j=0;j<str.length;j++) {
				String s2=str[j];
				if(s1.equals(s2) && i>j) {
					break;
				}
				if(s1.equals(s2)) {
					count++;
				}	
			}
			if(count>0) {
				System.out.println("The character "+s1+" Present "+count+" times");
			}
		}
	}
}

