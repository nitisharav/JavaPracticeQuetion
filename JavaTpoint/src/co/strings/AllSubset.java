package co.strings;

public class AllSubset {

	public static void main(String[] args) {
		//Find all the subset of String "FUN"
		//possible no. of subsets "n*(n+1)"
		String str = "FUN";
		int n= str.length();
		int temp=0;
String [] arr= new String [n*(n+1)/2];
for (int i=0;i<n;i++) {
	for (int j=i;j<n;j++) {
		arr[temp]=str.substring(i, j+1);
		
		System.out.println("subset: "+arr[temp]);
		temp++;
	}
}
for (int i=0;i<arr.length;i++) {
	System.out.println("Subsets of given String are: "+arr[i]);
}

	}

}
