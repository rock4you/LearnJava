import java.util.*;
//convert Beijing time to UTC time
public class UTC {
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		String str = String.valueOf(num);
		int len = str.length();
		int hour, min;
		int uhour;
		int utc=0;
		if(len==4)
		{
			hour=num/100;
			min=num%100;
			uhour=(hour-8+24)%24;
			utc=uhour*100+min;
		}
		else if(len==3)
		{
			hour=num/100;
			min=num%100;
			uhour=(hour-8+24)%24;
			utc=uhour*100+min;
		}
		else if(len==2)
		{
			hour=0;
			min=num%100;
			uhour=16;
			utc=uhour*100+min;
		}
		else if(len==1)
		{
			hour=0;
			min=num%100;
			uhour=16;
			utc=uhour*100+min;
		}
		else
			System.out.println("Error");
		
		System.out.println(utc);
	}
}
