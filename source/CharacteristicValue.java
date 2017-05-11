import java.util.*;
// calculate the characteristic value
public class CharacteristicValue {
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int i=1;
		int j=10;
		int tmp=0;
		int result=0;
		int index=0;
		index=num/((int) Math.pow(10,i-1) );
		while( index!=0 )
		{	
			tmp=(num%j)/((int) Math.pow(10,i-1) );
			if(i%2==0)
			{
				if(tmp%2==0)
				{
					result+=(int)Math.pow(2, i-1);
				}
			
			}
			else
			{
				if(tmp%2==1)
				{
					result+=(int)Math.pow(2, i-1);
				}
			}
			
			i=i+1;
			j=j*10;
			index=num/((int) Math.pow(10,i-1) );
			
		}	
		System.out.print(result);
	}
}
