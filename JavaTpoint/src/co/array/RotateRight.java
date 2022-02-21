package co.array;

public class RotateRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr=new int [] {1,2,3,4,5};
		int n=2;
		System.out.println("Original Array");
		for (int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
for (int i=0;i<n;i++) {
	int j;
	int first=arr[arr.length-1];
	for ( j=arr.length-1;j>0;j--) {
		arr[j]=arr[j-1];
	}
	arr[j]=first;
	
}
System.out.println();
System.out.println("Array after right rotation");
for (int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
}
	}

}
