package co.strings;
public class Reverse {
	public static void main (String[] args) {
		String str="Dream big";
		String rev="";
		for (int i=0;i<str.length();i++) {
			rev=str.charAt(i)+rev;
		}
		System.out.println("Reverse of given string: "+rev);
	}
}