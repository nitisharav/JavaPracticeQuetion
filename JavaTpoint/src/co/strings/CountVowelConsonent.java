package co.strings;

public class CountVowelConsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="I am world greatest proggrammer.";
int cCount=0;
int vCount=0;
int count=0;
//for (int i=0;i<str.length();i++) {
//	if(str.charAt(i)!=' ') {
//		count++;
//	}
//	if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'
//||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'
//||str.charAt(i)=='O'||str.charAt(i)=='U'){
//		vCount++;
//	};
//
//}
//cCount=count-vCount; 
str=str.toLowerCase();
for (int i=0;i<str.length();i++) {
	if (str.charAt(i)!=' ') {
		count++;
	}
	if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||
			str.charAt(i)=='o'||str.charAt(i)=='u') {
		vCount++;}
		else if (str.charAt(i)>'a'&& str.charAt(i)<'z') {
			cCount++;
		
	}
}
System.out.println("count of characters: "+count);
System.out.println("count of vowel characters: "+vCount);
System.out.println("count of consonent characters: "+cCount);
	}

}
