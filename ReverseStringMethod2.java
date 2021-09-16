package Week2Day2;

public class ReverseStringMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test="String Reverse Using CharAt";
		int length=test.length();
		for(int i=length-1;i>=0;i--)
		{
			System.out.print(test.charAt(i));
		}

	}

}
