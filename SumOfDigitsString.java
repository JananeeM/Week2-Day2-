package Week2Day2;

public class SumOfDigitsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "Tes12Le79af65";
		int sum = 0,r;
		String number=text.replaceAll("[^0-9]","");
		//System.out.println(number);
		int n=Integer.parseInt(number);
		System.out.println("String Converted To Integer : " +n);
		
		while(n>0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println("Sum Of Digits in Given String is :"+sum);
	
	}

}
