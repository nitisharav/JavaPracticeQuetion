package co.strings;

public class DuplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Big black bug bit a big black dog on his big black nose";
str= str.toLowerCase();
//Split the string into words using built in function 
String [] words=str.split(" ");
for (int i=0;i<words.length;i++) {
	int count =1;
	for (int j=i+1;j<words.length;j++) {
		if(words[i].equals(words[j])) {
			count++;
			words[j]="0";
		}
	}
	if(count>1 &&words[i]!="0") {
		System.out.println("Duplicate word: "+words[i]+ " times repeated: "+count);
	}
	
}
}

}
