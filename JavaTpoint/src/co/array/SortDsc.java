package co.array;

public class SortDsc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= new int[] {5,2,8,7,1};
int temp=0;
System.out.println("Original array");
for (int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
	
}
System.out.println();
for (int i=0;i<arr.length;i++) {
	for (int j=i+1;j<arr.length;j++)
	{
		if (arr[i]<arr[j]) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
		}
	}
}
System.out.println("Sorted array in descending order");
for (int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
	
}

	}

}
