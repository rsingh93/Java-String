package javaString;

public class Teststringcomparison1 {

	public static void main(String[] args) {

		String s1 = "Rahul";
		String s2 = "Rahul";
		String s3 = new String("Rahul");
		
		String s4 = "Singh";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s4.equals(s1));
	}

}
