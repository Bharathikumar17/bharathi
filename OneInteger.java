import java.util.Arrays;
import java.util.Scanner;

public class OneInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String a=scan.nextLine();
		String a1[]=a.split(" ");
		int[] s1 = Arrays.stream(a1).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(s1);
		for(int i=0;i<s1.length;i++)
		{
			if(i==0)
			{
				if(s1[i]!=s1[i+1])
				  System.out.println(s1[i]);
			}
			else if(i==(s1.length-1))
			{
				if(s1[s1.length-2]!=s1[s1.length-1])
					System.out.println(s1[s1.length-1]);
			}
			else
			{
				if(!(s1[i-1]==s1[i]||s1[i]==s1[i+1]))
					System.out.println(s1[i]);
			}
		}
	}
}
