package Week2Day2;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test="Feeling Good";
		char[] ch=test.toCharArray();
		int length=test.length();
		for(int i=length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		

	}

}
