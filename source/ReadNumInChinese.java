import java.util.*;
//4.2 Read the num in Chinese

public class ReadNumInChinese {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String [] ch = new String[10];
		ch[0]="ling";
		ch[1]="yi";
		ch[2]="er";
		ch[3]="san";
		ch[4]="si";
		ch[5]="wu";
		ch[6]="liu";
		ch[7]="qi";
		ch[8]="ba";
		ch[9]="jiu";
		int n = in.nextInt();
		if(n<0)
		{
			System.out.print("fu ");
			n=0-n;
		}
		String s = Integer.toString(n);
		//System.out.println(s);
		char numarray[]=s.toCharArray();
		int i=1;
		for (i=0;i<s.length();i++)
		{
			if(i!=0)
				System.out.print(" ");
			int x=Integer.parseInt(String.valueOf(numarray[i]));
			System.out.print(ch[x]);
		}
		
	}

}
