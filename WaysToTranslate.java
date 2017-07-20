import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class WaysToTranslate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int count=0,n,i=0;
		List<Integer>l=new ArrayList<Integer>();
		if(a>0)
		{
			count++;
			while(a>9)
			{
				n=a%100;
				if(n<27&&n!=0)
				{
					count++;
					l.add(1);
				}
				else
				{
					l.add(0);
				}
				a=a/10;
			}
			for(int j=i+2;j<l.size()&&i<l.size()-2;j++)
			{
				if(l.get(i)==0)
				{
					i++;
					continue;
				}
				if(l.get(j)!=0)
					count++;
				if(j+1==l.size())
					i++;
			}
			System.out.println(count);
		}
	}
}
