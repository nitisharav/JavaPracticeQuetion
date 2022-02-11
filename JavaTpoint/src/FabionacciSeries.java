
public class FabionacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,n3,i,count=10; //declaring 1st no and 2nd no.
	System.out.print(n1+" "+n2);//printing 1st and 2nd no
		for (i=2;i<count;i++) 
		{
	//		System.out.print(n1+" "+n2);
		n3=n1+n2;
		System.out.print(" "+n3);//printing 3rd no

		n1=n2;
		n2=n3;


		}

	}

}
