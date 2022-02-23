package co.strings;

public class CountCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str= "This is Nitish";
int count=0;
System.out.println("Original String: "+str);
for (int i=0;i<str.length();i++) {
	if(str.charAt(i)!=' ') 
		count++;
	
}
System.out.println("Number of counts of character in string: "+count);
	}

}
