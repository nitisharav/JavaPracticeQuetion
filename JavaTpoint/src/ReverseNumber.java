import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int i;
		
		int R = 0;
		int j=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number that need to be reversed");
		int num=scan.nextInt();
		int K=num;
		int N=num;
		while (K>0)
		{R= N%10;
		N=N/10;
        j=j*10+R;
        K=K/10;
       
		}
	
   
		 System.out.println(j);
	}

}
