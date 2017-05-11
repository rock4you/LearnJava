import java.util.*;
//5 Addition of polynomial

public class Polynomial {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int[] coefs= new int[101];
		
		int t=0;
		int index=0;
		int zero=0;
		while (zero!=2) {
			t = in.nextInt();
			if(t==0)
				zero+=1;
			coefs[t] += in.nextInt();
			if(coefs[t]!=0)
				index=1;
		}
		if(index==0)
		{
			System.out.print(0);
			return;
		}
		index=0;
		int i=0;
		int k=0;
		for(i=0;i<101;i++)
		{
			if(coefs[i]!=0)
				index=1;
		}
		if(index==0)
		{
			System.out.print(0);
			return;
		}
		int mark=0;
		for(i=100;i>-1;i--)
		{
			if(coefs[i]!=0)
			{
				if(coefs[i]>0)
				{
					if(coefs[i]!=1)
						System.out.print(coefs[i]);
				}
				else
				{
					if(mark==0)
					{
						if(coefs[i]!=-1)
							System.out.print(coefs[i]);
						else
							System.out.print("-");
					}
						
					else
					{
						if(coefs[i]!=-1)
							System.out.print(0-coefs[i]);
					}
						
						
				}
					
				if(i>0)
				{
					System.out.print("x");
				}
				if(i>1)
				{
					System.out.print(i);
				}
				
				mark=0;
				for(k=i-1;k>-1;k--)
				{
					if(coefs[k]!=0)
					{
						if(coefs[k]>0)
							System.out.print("+");
						else
						{
							System.out.print("-");
							mark=1;
						}
							
						k=-1;
					}
				}
				
				/*
				if(i!=0 )
					System.out.print("+");
				*/
					
			}
			
		}
	}

}

/*最后的加号去掉
9 -1
0 0
0 0
-1x9+
 */

/*最后的加号去掉
9 1
0 0
0 0
x9+
*/

/* -1也是1啊，加号去掉，1去掉。
9 -1
0 0
8 -1
0 0
-1x9+-1x8+
*/