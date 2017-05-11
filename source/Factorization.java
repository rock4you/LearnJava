import java.util.*;
//7.1 Factorization

public class Factorization
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		//String s[] = new String[100];
		int num = in.nextInt();
		if(isprime(num))
		{
			System.out.print(num);
			System.out.print("=");
			System.out.print(num);
		}
		else
		{
			System.out.print(num);
			System.out.print("=");
			String x="";
			//int qrt = (int) Math.sqrt(num);
			int i = 2;
			for (i = 2; i < num+1; i++) {
				if (num % i == 0) {
					//System.out.print(i);
					x+=i;
					num=num/i;
					i=1;
					x+='x';
				}
				
			}
			x=x.substring(0, x.length()-1);
			System.out.print(x);
		}
		
			
	}
	
	public static boolean isprime(int num) {
		int qrt = (int) Math.sqrt(num);
		int i = 2;
		for (i = 2; i < qrt + 1; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
