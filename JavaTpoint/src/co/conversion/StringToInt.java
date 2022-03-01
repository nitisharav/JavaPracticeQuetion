package co.conversion;

public class StringToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="200";
int k=10;
String str=String.valueOf(k);
//int i=Integer.valueOf(s);
int i=Integer.parseInt(s);
String str2= Integer.toString(k);
System.out.println("String coverted to integer: "+i);
System.out.println("Intger coverted to string: "+str);
System.out.println("Intger coverted to string: "+str2);
	}

}
