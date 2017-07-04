import java.util.Arrays;
import java.util.Scanner;
public class Subset {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String b1=scan.nextLine();
		String b2=scan.nextLine();
		int count=0;
			String a1[]=b1.split(" ");
			String a2[]=b2.split(" ");
			int[] s1 = Arrays.stream(a1).mapToInt(Integer::parseInt).toArray();
			int[] s2 = Arrays.stream(a2).mapToInt(Integer::parseInt).toArray();
			for(int i=0;i<s1.length;i++)
			{
				//System.out.println(s1[i]);
				for(int j=0;j<s2.length;j++)
				{
					if(s1[i]==s2[j])
						count++;
				}
			}
			if(count==s1.length)
				System.out.println("Subset");
			else
				System.out.println("NotSubset");
	}
}
