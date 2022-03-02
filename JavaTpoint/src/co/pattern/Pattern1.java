package co.pattern;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int line=5;
		for (int i=1;i<line+1;i++) {
			for (int j=line;j>0;j--) {
				if(i==j) {
					System.out.print("*");
				}
				else
					System.out.print(j);
					
			}
			System.out.println();
		}
		

	}

}
