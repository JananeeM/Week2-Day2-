package Week2Day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		String test = "I am a software tester"; 
		String[] splitArray = test.split(" ");
		System.out.println("The Original String Is:"+test);
		System.out.println("Reversing Even Words In The Given String :");
		for (int i = 0; i < splitArray.length; i++) {
			if(i%2!=0)
			{
				
				int length = splitArray[i].length();
				
				for(int j=length-1;j>=0;j--)
				{
					System.out.print(splitArray[i].charAt(j));
				}
				System.out.print(" ");
			}
			else
			{
				System.out.print(splitArray[i]+ " ");
			}
					
			}
	}
}
