package co.pattern;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<=4;i++) {
			for(int j=1;j<=9;j++) {
				if (j==i||j==5||j==10-i) {
					System.out.print("*");
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println();
		}

	}

}
