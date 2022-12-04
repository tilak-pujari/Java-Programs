package com.grooming;

public class CharNumSplChar {

	public static void main(String[] args) {

		String s="b12@c$";	//output bc12@$
		String character="";
		String digit="";
		String specialchar="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isAlphabetic(ch)) {
				character+=ch;
			}
			else if(Character.isDigit(ch)) {
				digit+=ch;
			}
			else {
				specialchar+=ch;
			}
		}
		System.out.println(character+digit+specialchar);
	}

}
