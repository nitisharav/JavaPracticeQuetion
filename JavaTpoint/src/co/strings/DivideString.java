package co.strings;

public class DivideString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "aaaabbbbcccc";
	    int n=3;
	    int elen=str.length()/n;

	 
	
	    if (str.length()%n!=0) {
	    	System.out.println("String can't be divided into " +n+" equal parts");
	    }
	    else {
	    	for (int i=0;i<str.length();i=i+elen) {
	    		System.out.println(str.substring(i, i+elen));
	    	}
	    	
	    }
	    	

	}

}
