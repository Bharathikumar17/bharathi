import java.util.Arrays;
import java.util.Scanner;

public class ArraysUnique {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String a=scan.nextLine();
		String a1[]=a.split(" ");
		int[] s1 = Arrays.stream(a1).mapToInt(Integer::parseInt).toArray();
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i]==i)
				System.out.println(s1[i]);
		}
	}
}
