import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		int i;
		String ReverseChar = "";
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter string/number to check palindrome");
		String N = scan.nextLine();
		int length = N.length();
		
	//	for (i= length-1;i>=0;i--)
	  //   ReverseChar =ReverseChar + N.charAt(i);
		for (i=0;i<length;i++)
			ReverseChar=N.charAt(i) + ReverseChar;
		System.out.println(ReverseChar);
		
	}
}
