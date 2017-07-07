import java.util.Scanner;
public class NotPalindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String a=scan.nextLine();
		String a1[]=a.split(" ");
		int l,max=0;
		for(int i=0;i<a1.length;i++)
		{
			StringBuffer s=new StringBuffer(a1[i]);
			s.reverse();
			String a2=String.valueOf(s);
			if(!(a1[i].equals(a2)))
			{
				l=a1[i].length();
				if(l>max)
					max=l;
			}
		}
		System.out.println(max);
	}
}
