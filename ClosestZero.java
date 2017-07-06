import java.util.Arrays;
import java.util.Scanner;
public class ClosestZero {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String a=scan.nextLine();
		String a1[]=a.split(" ");
		int[] s1 = Arrays.stream(a1).mapToInt(Integer::parseInt).toArray();
		int pmax=100;
		String l="";
		String o="";
		int n=0,x=0;
		label:
		for(int i=0;i<s1.length;i++)
		{
			for(int j=i+1;j<s1.length;j++)
			{
				x=s1[i]+s1[j];
				if(x!=0)
				{
					 n=Math.abs(x);
					if(pmax>=n)
					{
						pmax=n;
						l=s1[i]+" "+s1[j];
					}	
				}
				else 
				{
					o=s1[i]+" "+s1[j];
					System.out.println(o);
					break label;
				}
			}
		}
		if(x!=0)
		{
			System.out.println(l);
		}
	}
}
