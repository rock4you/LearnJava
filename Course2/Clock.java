import java.util.*;
public class Main {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());
		clock.tick();
		System.out.println(clock);
		in.close();
	}
}

class Clock{
	public int hour;
	public int minute;
	public int second;
	public Clock(int h, int m, int s)
	{
		hour=h;
		minute=m;
		second=s;
	}
	public void tick()
	{
		second+=1;
		if(second==60)
		{
			second=0;
			minute+=1;
			if(minute==60)
			{
				minute=0;
				hour+=1;
				if(hour==24)
				{
					hour=0;
				}
			}
		}
	}
	
	public String toString()
	{
		StringBuilder result = new StringBuilder();
		result.append(String.format("%02d", hour));
		result.append(":");
		result.append(String.format("%02d", minute));
		result.append(":");
		result.append(String.format("%02d", second));
		return result.toString();
		
	}
	
	
	
}