package co.strings;

public class CountPunctuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count = 0;
String str= "He said,'The mailmain loves you. I heard it with my own ears'";
for (int i=0;i<str.length();i++) {
	if (str.charAt(i)==',' ||str.charAt(i)== '.'||str.charAt(i)== ';'||str.charAt(i)== '-'
			||str.charAt(i)== '\"'||str.charAt(i)== '?'||str.charAt(i)== ':'||str.charAt(i)== '\'') {
		count++;
	}
}
System.out.println("count of punctuation: "+count);
	}

}
