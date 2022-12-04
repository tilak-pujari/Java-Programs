package com.grooming;

import java.util.ArrayList;
import java.util.Scanner;

public class SwapFirstLastWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		//String s="Good morning good bye";
		s=s.toLowerCase();
		String[] words=s.split("\\s");
		ArrayList<String> al=new ArrayList<String>();
		String firstlast="";
		for(String word:words) 
		{
			al.add(word);
		}
		String firstword=al.get(0);
		String lastword=al.get(al.size()-1);
		al.set(0, lastword);
		al.set(al.size()-1, firstword);
		
		for(int i=0;i<al.size();i++)
		{
			firstlast=firstlast+al.get(i)+" ";
		}
		System.out.println(firstlast);
	}
}