import java.util.*;
//6.1 Length of Words

public class LengthofWords 
{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		char array[] = s.toCharArray();
		int len = array.length;
		int j = 0;
		int num = 0;
		int index=0;
		for (j = 0; j < len; j++) 
		{
			if(array[j]=='.')
			{
				if(j==0)
				{
					//System.out.print(0);
					index=1;
					return;
				}
				if(array[j-1]!=' ')
				{
					System.out.print(num);
					num=0;
					index=1;
				}
				if(index==0)
				{
					num=0;
				}
					//System.out.print(0);
			}
			
			if (array[j] != ' ')
			{
				num += 1;
				index=0;
			}
			
			if(array[j]==' ')
			{
				if(j==0)
				{
					num=0;
				}
				else
				{
					if(array[j-1]!=' ')
					{
						System.out.print(num);
						index=1;
						System.out.print(' ');
						num=0;
					}
				}
				
				
			}
		}
	}
}