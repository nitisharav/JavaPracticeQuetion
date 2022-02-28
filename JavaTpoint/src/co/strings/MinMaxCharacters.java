//package co.strings;
//
//public class MinMaxCharacters {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//String str= "Grass is greener on the other side";
//str =str.toLowerCase();
////long t= str.chars().distinct().count();
//int [] freq= new int[str.length()];
//char minChar=str.charAt(0), maxChar=str.charAt(0);
//int i,j,min,max;
//
//char string[]=str.toCharArray();
//for (i=0;i<string.length;i++) {
//	freq[i]=1;
//	for(j=i+1;j<string.length;j++) {
//		if(string[i]==string[j] && string[i]!=' ' && string[i]!='0') {
//			freq[i]++;
//			string[j]='0';
//		}
//	}
//}
//min=max=freq[0];
//for (i=0;i<freq.length;i++) {
//	if(min>freq[i] && freq[i]!='0') {
//		min=freq[i];
//		minChar = string[i];
//	}
//	if(max < freq[i]) {
//		max=freq[i];
//		maxChar= string[i];
//	}
//}
//System.out.println("Minimum occuring character: "+ minChar);
//System.out.println("Maximum occuring character: "+ maxChar);
//	}
//
//}
package co.strings;

public class MinMaxCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str= "Grass is greener on other side";
str=str.toLowerCase();
char[] string=str.toCharArray();
int[] freq= new int [str.length()];

//start counting each word
for (int i=0;i<string.length;i++) {
	freq[i]=1;
	for(int j=i+1;j<string.length;j++) {
		if(string[i]==string[j] && string[j]!='0' && string[j]!=' ') {
		freq[i]++;
		string[j]='0';
		}
	}
}

//find max and min
int min=freq[0];
int max=freq[0];
char	minChar=0;
char	maxChar=0;
for (int i=0;i<freq.length;i++) {
	if(min>freq[i]) {
		min=freq[i];
				minChar= string[i];
	}
	if(max<freq[i]) {
		max=freq[i];
			maxChar= string[i];
	}
}
System.out.println("Max char: "+maxChar);
System.out.println("Min char: "+minChar);

	}

}

