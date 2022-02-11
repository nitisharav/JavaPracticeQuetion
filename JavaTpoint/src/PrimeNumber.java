import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter no. prime numbers");
		int count=scan.nextInt();
		int n1=2,i;
		if (count==1){
		System.out.print(n1);
		}
		if (count==0){
			System.out.print("none");
			}
		else{ 
		
		for (i=3;i<=count;i++) {
			for (int j=2;j<i;j++){
		if (i%j==0){

		
		break;
		}
		else {
			System.out.print(" "+i);
		}
		}
		}
		}}
	}


