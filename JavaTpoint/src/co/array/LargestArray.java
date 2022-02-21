package co.array;

public class LargestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr=new int[] {1,2,25,11,35,76,56};
System.out.println("Original Array");
int max=arr[0];
for (int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
	
}
System.out.println();
System.out.println("Largest element in array");
for (int i=0;i<arr.length;i++) {
	
	if (arr[i]>max) {
		max=arr[i];
	}
	
}
System.out.println(max);
	}

}
