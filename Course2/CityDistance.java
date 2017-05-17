import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		int citynum=0;
		int i=0;
		int j=0;
		HashMap<String, Integer> city = new HashMap<String, Integer>();
		while(in.hasNext())
		{
			String a = in.next();
			if( a.equals("###"))
				break;
			if(a.equals("Huzhou"))
				a="Suzhou";
			city.put(a, citynum);
			citynum++;
		}
		int d[][] = new int [citynum][citynum];
		for(i=0;i<citynum;i++)
		{
			for(j=0;j<citynum;j++)
			{
				d[i][j]=in.nextInt();
			}
		}
		String citya = in.next();
		String cityb = in.next();
		
		int acity = city.get(citya);
		int bcity = city.get(cityb);
		System.out.println(d[acity][bcity]);
		
		in.close();
	}
}


