import java.util.Arrays;
import java.util.Scanner;
public class FirstRepeated {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String a=scan.nextLine();
		String a1[]=a.split(" ");
		int[] s1 = Arrays.stream(a1).mapToInt(Integer::parseInt).toArray();
		label:
		for(int i=0;i<s1.length;i++)
		{
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i]==s1[j])
				{
					System.out.print(s1[i]);
					break label;
				}
			}
		}
	}

}
