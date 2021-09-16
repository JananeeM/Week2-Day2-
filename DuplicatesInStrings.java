package Week2Day2;

public class DuplicatesInStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java  sessions in java week1";
		int count=0;
		String[] strArray=text.split(" ");
		int length=strArray.length;
		System.out.println(length);
		for(int i=0;i<length;i++)
		{
			
			for(int j=i+1;j<strArray.length;j++)
			{
				if(strArray[i].equals(strArray[j]))
				{
					count++;
					
					strArray[j]=(strArray[j].replace(strArray[j], ""));
					//System.out.println(strArray[j]);
				}
			}
			if(count>0)
				strArray[i].replace(strArray[i], "");
			
		}
		for(int j=0;j<strArray.length;j++)
		{
			if(count>1&&strArray[j]!="") {
				System.out.print(" "+strArray[j]);
				
			}
			

			
		}
			
	}

}
