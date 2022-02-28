package co.strings;

public class StringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1= "abcde", str2="deabc";

System.out.println(str1);
if (str1.length()!=str2.length()) {
	
	System.out.println("Second string is not the rotation of first string");
}
else {
	str1=str1+str1;
	if (str1.indexOf(str2)==-1) {
		System.out.println("Second string is not the rotation of first string");
	}
	else System.out.println("Second string is the rotation of first string");
}
	}

}
