import java.util.*;
//6.2 GPS

public class GPS
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		//String s[] = new String[100];
		String s;
		s = in.nextLine();
		int hour=0, min=0, sec=0;
		
		while(s.equals("END")==false)
		{
			String [] key = s.split(",");
			//System.out.println(key.length);
			if(key[0].equals("$GPRMC") && key[2].equals("A"))//字段0是$GPRMC、字段2是A
			{
				char arr[] = s.toCharArray();//变成字符数组
				int i=0;
				int x=0;
				x=arr[1]^arr[2];
				for(i=3;arr[i]!='*';i++)
				{
					x=x^arr[i];
				}
				x=x%65536;
				String h = Integer.toHexString(x);
				//System.out.println(h);
				char jiaoyan[] = key[12].toCharArray();
				char temp[]=new char[jiaoyan.length-2];
				for(i=2;i<jiaoyan.length;i++)
				{
					temp[i-2]=jiaoyan[i];
				}
				String jy=String.valueOf(temp);
				if(jy.length()<2)
					jy="0"+jy;
				if( h.equalsIgnoreCase(jy) )//校验和相等
				{
					//System.out.println(key[1]);
					char tempnum [] = key[1].toCharArray();
					char timetemp[] = new char[6];
					for (i=0;i<6;i++)
					{
						timetemp[i]=tempnum[i];
					}
					String time = String.valueOf(timetemp);
					//System.out.println(time);
					int valuetime=Integer.parseInt(time);
					//System.out.println(valuetime);
					hour=(8+ valuetime/10000)%24;
					min=(valuetime%10000)/100;
					sec=valuetime%100;
				}
			}
			s = in.nextLine();
		}
		if(hour<10)
		{
			System.out.print(0);
		}
		System.out.print(hour);
		System.out.print(":");
		if(min<10)
		{
			System.out.print(0);
		}
		System.out.print(min);
		System.out.print(":");
		if(sec<10)
		{
			System.out.print(0);
		}
		System.out.println(sec);	
	}
}
/*
$GPRMC,024813.640,A,3158.4608,N,11848.3737,E,10.05,324.27,150706,,,A*50
$GPRMC,024813.640,A,3158.4608,N,11848.3737,E,10.05,324.27,150706,,,A*50
END
*/