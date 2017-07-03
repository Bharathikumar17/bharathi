import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		if(a==0)
		{
			System.out.println("Zero");
		}
		else if(a>0)
		{
			System.out.println("ositive");
		}
		else
		{
			System.out.println("Negative");
		}
	}

}
