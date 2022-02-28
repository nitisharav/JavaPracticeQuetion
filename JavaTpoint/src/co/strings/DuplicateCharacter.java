//package co.strings;
//
//public class DuplicateCharacter {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//String str="Great Responsibility";
//str=str.toLowerCase();
//char [] string=str.toCharArray();
//for (int i=0;i<string.length;i++) {
//	for (int j=i+1;j<string.length;j++) {
//		if(string[i]==string[j]&&string[i]!=0&&string[i]!=' ') {
//			System.out.println(string[i]);
//			string[j]=0;
//			break;
//			
//			
//		}
//	}
//}
//	}
//
//}
package co.strings;

public class DuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Great Responsibility";
str=str.toLowerCase();
char [] string=str.toCharArray();

for (int i=0;i<string.length;i++) {
	int count=1;
	for (int j=i+1;j<string.length;j++) {
		if (string[i]==string[j]&&string[i]!=' ') {
			count++;
			string[j]=0;
		}
		
			
			
		}
	if(count>1 && string[i]!=0) {
		System.out.println("Duplicate characters: "+string[i]+" times repeated: "+count);
	
	}
}
	}

}
