package Week2Day2;

public class DuplicateInSTringsMethod2 {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count=0;
		String[] strArray=text.split(" ");
		int length=strArray.length;
		for(int i=0;i<length;i++)
		{
			
			for(int j=i+1;j<strArray.length;j++)
			{
				if(strArray[i].equalsIgnoreCase(strArray[j]))
					strArray[j]="";
				
			}
	   }
		for(int i=0;i<length;i++)
		{
			System.out.print(" "+strArray[i]);
		}
	}
}


