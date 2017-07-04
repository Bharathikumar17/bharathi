import java.util.Arrays;
import java.util.Scanner;
public class Concentation
{
  public static void main(String args[])
  {
      Scanner scan=new Scanner(System.in);
      String s=scan.nextLine();
      String s1[]=s.split(" ");
      int[] array = Arrays.stream(s1).mapToInt(Integer::parseInt).toArray();
      Arrays.sort(array);
      s="";
      for(int i=0;i<array.length;i++)
        s=s+array[i];
      int l=s.length();
      int j=l%3;
      int k=0;
      for(int i=l-1;i>=0;i--,k++)
      {
        if(k==j)
        {
          System.out.print(",");
          j=j+3;
		    }
		  System.out.print(s.charAt(i)+"");
	    }
  }
}
