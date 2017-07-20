import java.util.Arrays;
import java.util.Scanner;
public class DeletingDigits {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		int a=scan.nextInt();
		if(s.length()>=a)
		{
			String str[]=s.split("");
			Arrays.sort(str);
			String s2=Arrays.toString(str);
			String st=s2.replaceAll("\\[","").replaceAll("\\]","").replaceAll("\\,","").replaceAll("\\W","");
			String s1=st.substring(0,a);
			System.out.println(s1);
		}
		else
			System.out.println("out of range");
	}
}
