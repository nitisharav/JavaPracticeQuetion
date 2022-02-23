package co.strings;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1="Brag";
String str2= "Grab";
System.out.println("String1: "+str1);
System.out.println("string2: "+str2);
str1=str1.toLowerCase();
str2=str2.toLowerCase();
//StringBuffer string = new StringBuffer(str1);
//StringBuffer string2 = new StringBuffer(str2);



if (str1.length()!=str2.length()) {
	System.out.println("Not an Anagram");
}

//else {
//	for (int i=0;i<str1.length();i++) {
//		for (int j=i+1;j<str1.length();j++) {
//			if(string.charAt(i)>string.charAt(j)) {
//			char temp =string.charAt(i);
//			string.setCharAt(i, string.charAt(j));
//			string.setCharAt(j, temp);
//			}
//			if(string2.charAt(i)>string2.charAt(j)) {
//				char temp2 =string2.charAt(i);		
//				string2.setCharAt(i, string2.charAt(j));	
//				string2.setCharAt(j, temp2);	
//				}
//
//		}
//	}
//	
//	System.out.println("Sorted String1: "+string);
//	System.out.println("Sorted string2: "+string2);
//	
//	if(string.compareTo(string2)==0) {
//		System.out.println("Its Anagram");
//		
//	}
//	else {
//		System.out.println("Strings are not Anagram");
//
//	}
//}
else {
	char [] string1=str1.toCharArray();
	char [] string2=str2.toCharArray();
	
	Arrays.sort(string1);
	Arrays.sort(string2);
	if(Arrays.equals(string1, string2)) {
		System.out.println("Its Anagram");
		
		
	}
	else {
		System.out.println("Strings are not Anagram");

	
}

}

}}
