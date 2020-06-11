package mainTest;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hellow world";
		
		StringBuilder str1 = new StringBuilder();
		str1.append(str);
		
		str1 = str1.reverse();
		System.out.println(str1);
		

	}

}
