import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(), in.nextInt());
		Fraction b = new Fraction(in.nextInt(),in.nextInt());
		a.print();
		b.print();
		
		a.plus(b).print();
		
		a.multiply(b).plus(new Fraction(5,6)).print();
		a.print();
		b.print();
		in.close();
	}
}


class Fraction
{
	public int son;
	public int mum;
	public Fraction(int a, int b)
	{
		if(b%a==0)
		{
			b=b/a;
			a=1;
		}
		son=a;
		mum=b;
	}
	
	public double toDouble()
	{
		return (double)son/mum;
	}
	
	public Fraction plus(Fraction r)
	{
		Fraction x = new Fraction(son,mum);
		x.son=x.son*r.mum+r.son*x.mum;
		x.mum=x.mum*r.mum;
		if(x.mum%x.son==0)
		{
			x.mum=x.mum/x.son;
			x.son=1;
		}
		return x;
	}
	
	public Fraction multiply(Fraction r)
	{
		Fraction x = new Fraction(son,mum);
		x.mum=x.mum*r.mum;
		x.son=x.son*r.son;
		if(x.mum%x.son==0)
		{
			x.mum=x.mum/x.son;
			x.son=1;
		}
		return x;
	}
	
	public void print()
	{
		if(mum==1 && son==1)
		{
			System.out.println("1/1");
		}
		else
		{
			if(mum%son==0)
			{
				mum=mum/son;
				son=1;
			}
			System.out.print(son);
			System.out.print('/');
			System.out.println(mum);
			
		}
	}
	
	
}