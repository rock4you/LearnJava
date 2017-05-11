import java.util.*;
//7.2 GoodNum

public class GoodNum
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		//String s[] = new String[100];
		int a = in.nextInt();
		int b = in.nextInt();
		int j=0;
		int index=0;
		String aa="";
		for (j=a;j<b+1;j++)
		{
			if(isgoodnum(j))
			{
				index=1;
				//System.out.print(j);
				//System.out.print(' ');
				aa+=j;
				aa+=' ';
			}
		}
		
		aa = aa.substring(0,aa.length() - 1);
		System.out.print(aa);
		if(index==0)
			System.out.println();
			
	}
	
	public static boolean isgoodnum(int num) {
		int sum=0;
		int i=1;
		for(i=1;i<num;i++)
		{
			if(num%i==0)
				sum+=i;
		}
		if(sum==num)
			return true;
		else
			return false;
	}
}
