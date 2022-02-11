import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scan= new Scanner(System.in);
   System.out.println("Enter number to find factorial");
   int N= scan.nextInt();
   int Temp = 1 ;
   for (int i=0;i<N;i++)
  
	   Temp=Temp*(N-i);
   
   System.out.println("Factorial of N= "+Temp );
	}

}
