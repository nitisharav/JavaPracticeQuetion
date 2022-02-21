package co.array;

public class SmallestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=new int[] {25,11,7,75,56};
int min=arr[0];
System.out.println("Original array");
for (int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
}
System.out.println();
System.out.println("Smallest element in Array");
for (int i=0;i<arr.length;i++) {
	if (min>arr[i]) {
		min=arr[i];
	}
}
System.out.println(min);
	}

}
