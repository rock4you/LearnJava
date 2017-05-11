import java.util.*;

public class Temperature
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Double f = in.nextDouble();
		int c;
		c=(int)((f-32)*5/9.0);
		System.out.println(c);
	}
}