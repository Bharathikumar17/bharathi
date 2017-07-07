import java.util.Arrays;
import java.util.Scanner;
public class TargetNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String a=scan.nextLine();
		int m=scan.nextInt();
		String a1[]=a.split(" ");
		int[] s1 = Arrays.stream(a1).mapToInt(Integer::parseInt).toArray();
		label:
		for(int i=0;i<s1.length;i++)
		{
			for(int j=i+1;j<s1.length;j++)
			{
				int c=s1[i]+s1[j];
				if(c==m)
				{
					System.out.println(s1[i]+" "+s1[j]);
					break label;
				}
			}
		}
	}
}
