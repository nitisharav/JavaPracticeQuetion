package co.strings;

public class FrequencyCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="picture perfect";
char [] string= str.toCharArray();
for (int i=0;i<string.length;i++) {
	int count =1;
	for (int j=i+1;j<string.length;j++) {
		if (string[i]==string[j]&&string[i]!=' ') {
			count++;
			string[j]='0';
		}
	}
	if(string[i]!='0'&&string[i]!=' ')
	System.out.println("Frquency of "+string[i]+" is "+count+" times" );
}
	}

}
