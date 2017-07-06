import java.util.Scanner;
public class WordsReverse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String a=scan.nextLine();
		String a1[]=a.split(" ");
		for(int i=a1.length-1;i>=0;i--)
		{
			System.out.print(a1[i]+" ");
		}
	}

}
