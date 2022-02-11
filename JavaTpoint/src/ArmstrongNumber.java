import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scan= new Scanner(System.in);
 System.out.println("Enter number to find its Armstrong number ");
 int N= scan.nextInt();
 int temp=N;
 int K=N;
 int count=0;
 double O=0;
 double T=O;
 
    
 while (temp>0)
 {
	 
 temp=temp/10;

 count= count+1;

 
 }
 System.out.println("digits in numbers= "+count);
 
 while (K>0)
 {
	 int I=K%10; 
	 
 K=K/10;
double M= Math.pow(I, count);
 
 O= M+ O;
System.out.println(O);
 
T=O;
 }
 System.out.println("Armstrong number="+T);
 
	}
}
