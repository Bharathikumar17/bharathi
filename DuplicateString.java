import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
public class DuplicateString {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String a1=scan.nextLine();
		String l[]=a1.split("");
		Set<String>al=new LinkedHashSet<String>(Arrays.asList(l));
		String b=al.toString();
		b=b.replaceAll("\\]","").replaceAll("\\[","").replaceAll("\\s","").replaceAll(",","");
		System.out.print(b);
	}

}
