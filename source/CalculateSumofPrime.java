import java.util.*;
//calculate the sum of prime 

public class CalculateSumofPrime {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int start = nthprime(n);
		if(n==m)
		{
			System.out.print(start);
			return;
		}
		int end = nthprime(m);
		int sum=start+end;
		int i=0;
		for(i=start+1;i<end;i++)
		{
			if(isprime(i))
				sum+=i;
		}
		System.out.print(sum);
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

	public static int nthprime(int n) {
		int j = 0;
		int i = 2;
		for (i = 2;; i++) {
			if (isprime(i)) {
				j += 1;
				if (n == j)
					return i;
			}
		}

	}

}
