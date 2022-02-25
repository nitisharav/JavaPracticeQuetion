package co.strings;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str= "Kayak" ;
str=str.toLowerCase();
String temp="";
for (int i=0;i<str.length();i++) {
	temp=str.charAt(i)+temp;

	}
if (temp.equals(str)) {
	System.out.println("String is a palindrome");
}
else {
	System.out.println("String is not a palindrome"+temp+" "+str);
	
}

	}}
