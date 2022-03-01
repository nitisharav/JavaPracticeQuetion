//package co.search.sort;
//
//public class LinearSearchExample {
//
//	public static void main(String[] args) {
//		int[] a1=new int[] {10,20,30,50,70,90};
//		int key=50;
//		
//		System.out.println(key+" is found at index: "+linearSearch(a1,key));
//	}
//		// TODO Auto-generated method stub
//public static int linearSearch(int[] arr,int key) {
//	for (int i=0;i<arr.length;i++) {
//		if(arr[i]==key) {
//			return i;
//		}
//	}
//	return -1;
//
//	}
//
//}



package co.search.sort;

public class LinearSearchExample{
	public static void main (String [] args) {
		int a1[]= {10,20,30,50,60,70,80,90};
		int k1=30;
		
		System.out.println(k1+" is found at index: "+linearSearch(a1,k1));
	}
	public static int linearSearch(int[] arr,int key) {
		for (int i=0;i<arr.length;i++) {
			if (arr[i]==key) {
				return i;
			}
		}
		
		return -1;
	}
}