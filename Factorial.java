import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	        int N=s.nextInt();
	        if(N>=0)
	        {
	        	int fact=1;
	        	if(N>1)
	        	{
	        		for(int i=2;i<=N;i++)
	        			fact=fact*i;
	        	}
	            System.out.print(fact);
	        }
	        else if(N<0)
	        	System.out.println("Invalid");
	}

}

