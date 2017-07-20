import java.util.Scanner;
public class IntegerToBinary {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int K=scan.nextInt();
		double a=Math.pow(2,K);
		for(int i=0;i<a;i++)
		{
			String s=Integer.toBinaryString(i);
			if(s.length()<K)
			{
				String result="";
				for(int j=0;j<K-s.length();j++)
				{
					result+="0";
				}
				System.out.println(result+s);
			}
			else
				System.out.println(s);
		}
	}
}
