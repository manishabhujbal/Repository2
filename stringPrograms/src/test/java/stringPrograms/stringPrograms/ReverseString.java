package stringPrograms.stringPrograms;

public class ReverseString {
	
	public static void main(String[] args) {
		String str="Java";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			char c=str.charAt(i);
			System.out.print(c);
		}
	}
}
