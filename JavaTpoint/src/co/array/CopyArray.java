package co.array;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initialise an array
		int [] arr1= new int [] {1,2,3,4,5};
		//create another empty array of same length
		int arr2 []=new int [arr1.length];
		//copy elements of arr1 to arr2
		for (int i=0;i<arr1.length;i++)
		{
			arr2[i]=arr1[i];
		}
		System.out.println("Elements of original array");
		for (int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("Elements of new array");
		for (int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		
		

	}

}
