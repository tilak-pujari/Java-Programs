package com.grooming;

import java.util.Scanner;

public class NoOfVowelsInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.nextLine();
		//String s="Education";
		s=s.toLowerCase();
		
		for(int i=0;i<s.length();i++) 
		{
			char ch=s.charAt(i);
			int count=0;
			for(int j=0;j<s.length();j++) {
				char ch2=s.charAt(j);
				if((ch==ch2)&&(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')&& i>j) {
					break;	
				}
				if((ch==ch2)&&(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')) {
					count++;	
				}
			}
			if(count>0) {
				System.out.println("Vowel "+ch+" present:"+count+" times");
			}
			
		}
		
		
		
	}

}
