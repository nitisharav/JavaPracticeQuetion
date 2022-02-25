package co.strings;

public class ChangeCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Great Power";

StringBuffer string=new StringBuffer(str);
for (int i=0;i<str.length();i++) {
	if (Character.isLowerCase(str.charAt(i))){
		string.setCharAt(i, Character.toUpperCase(str.charAt(i)));
	}
	else if (Character.isUpperCase(str.charAt(i))){
		string.setCharAt(i, Character.toLowerCase(str.charAt(i)));
	}
}
System.out.println("String after case conversion: "+string);

	}

}
