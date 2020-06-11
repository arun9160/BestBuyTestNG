package mainTest;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Using string builder
		
		String str = "welcome to hyderabad";
		
		StringBuilder  stb = new StringBuilder();
		stb.append(str);
		stb = stb.reverse();
		System.out.println(stb);
		
		
		// Converting to char 
		String str2 = new String("Welcome to hyderabad");
		
		char chars[] = str2.toCharArray();//here the string converts to char
		for(int i = chars.length-1;i>=0;i--) {
			
			System.out.println(chars[i]);
		}
		
		
		
	}
	

}
