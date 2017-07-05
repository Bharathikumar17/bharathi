import java.util.Scanner;
public class ReverseString {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String a1=scan.nextLine();
		StringBuffer s=new StringBuffer(a1);
		s.reverse();
		System.out.println(s);
	}
}
