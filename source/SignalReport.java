import java.util.*;
//report the signal according to the num
public class SignalReport {
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int R=0, S=0;
		
		R=num/10;
		S=num%10;
		String [] rstr = new String[5];
		String [] sstr = new String[9];
		rstr[0]=", unreadable.";
		rstr[1]=", barely readable, occasional words distinguishable.";
		rstr[2]=", readable with considerable difficulty.";
		rstr[3]=", readable with practically no difficulty.";
		rstr[4]=", perfectly readable.";
		
		sstr[0]="Faint signals, barely perceptible";
		sstr[1]="Very weak signals";
		sstr[2]="Weak signals";
		sstr[3]="Fair signals";
		sstr[4]="Fairly good signals";
		sstr[5]="Good signals";
		sstr[6]="Moderately strong signals";
		sstr[7]="Strong signals";
		sstr[8]="Extremely strong signals";
		
		
		System.out.print(sstr[S-1]);
		System.out.print(rstr[R-1]);
	}
}
