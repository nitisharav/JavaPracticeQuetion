package co.strings;
//Revise once more
public class LongestRepeatingSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stubacbacb
		String str="acbdfghybdf";
		String temp="";
		int n= str.length();
		for (int i=0;i<n;i++) {
			for (int j=i+1;j<n;j++) {
				System.out.println(str.substring(i, n)+" compared with "+str.substring(j, n));
			String x=lcp(str.substring(i, n),str.substring(j, n));
			System.out.println(x);
			if(x.length()>temp.length()) {
				temp=x;
			}
			}
			
		}
		System.out.println("Answer: "+temp);

	}
	public static String lcp(String s,String t) {
		int n=Math.min(s.length(), t.length());
		for (int i=0;i<n;i++) {
			if(s.charAt(i)!=t.charAt(i)) {
				String sss=s.substring(0,i);
				System.out.println("1: "+sss+"'i': "+i);
				return s.substring(0, i);
		//	String sss=s.substring(0,i);
				//this returning blank
				
			}
			System.out.println("if matches"+i+"substring: "+s.substring(0,i+1));
		}
		System.out.println("2: "+s.substring(0, n));
		return s.substring(0, n);
	}

}
