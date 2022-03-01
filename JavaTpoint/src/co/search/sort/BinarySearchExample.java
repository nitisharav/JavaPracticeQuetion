//package co.search.sort;
//Using Recursion
////for binary search, array elements must be in ascending order
//public class BinarySearchExample {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int arr[]= {10,20,30,40,50,60};
//		int key=30;
//		int last=arr.length-1;
//		int result=binarySearch(arr,0,last,key);
//		if (result== -1) {
//			System.out.println("Element not found");
//		}
//		else
//			System.out.println("Element is found at index: "+result);
//				
//
//	}
//	public static int binarySearch(int arr[],int first,int last,int key) {
//		if (last>=first) {
//			int mid=first+(last-first)/2;
//			if (arr[mid]==key) {
//				return mid;
//			}
//			if(arr[mid]<key) {
//				return binarySearch(arr,first,mid-1,key);//search in left sub array
//			}
//			else {
//				return binarySearch(arr,mid+1,last,key);//search in right subarray
//			}
//		}
//		return -1;
//	}
//
//}

//Using Array
package co.search.sort;

import java.util.Arrays;

//for binary search, array elements must be in ascending order
public class BinarySearchExample {
	public static void main(String [] args) {
		int arr[]= {10,20,30,40,50};
		int key=30;
		int result=Arrays.binarySearch(arr, key);
		if (result<0) {
			System.out.println("Element not found");
		}
		else
			System.out.println(key+" found at index: "+result);
	} 
}