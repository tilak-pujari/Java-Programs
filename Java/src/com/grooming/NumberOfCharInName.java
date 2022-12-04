package com.grooming;

import java.util.Scanner;

public class NumberOfCharInName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name");
		String name=sc.nextLine();
		System.out.println("The Number of char in name "+name+" is:"+name.length());
		int count=0;
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if(ch==' ') {
				
			}
			else {
				count++;
			}
		}
		System.out.println("The Number of char in name "+name+" without spacing is:"+count);
	}

}
