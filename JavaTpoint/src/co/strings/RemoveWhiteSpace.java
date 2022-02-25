package co.strings;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= "Remove white spaces";
//		char[] ch=str1.toCharArray();
//		for (int i=0;i<ch.length;i++) {
//			if (ch[i]==' ') {
//				continue;
//			}
//			System.out.print("String after removing all white spaces : "+ch[i]);
//		}
		
		str1=str1.replaceAll(" ", "");  

		
		System.out.println("String after removing all white spaces : "+str1);

	}

}
