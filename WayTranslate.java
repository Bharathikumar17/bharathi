import java.util.*;

class WayTranslate

{
    
public static void main(String args[])
    
{
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int ways=0,n,i=0;
        Vector<Integer> v=new Vector<Integer>();
        if(num>0)
        {
            ways++;
            while(num>9)
            {
                n=num%100;
                if(n<27&&n!=0)
                {
                    ways++;
                    v.addElement(1);
                }
                else
                {
                    v.addElement(0);
                }
                num/=10;
            }
            for(int j=i+2;j<v.size()&&i<v.size()-2;j++)
            {
                if(v.elementAt(i)==0)
                {
                    i++;
                    continue;
                }
                if(v.elementAt(j)!=0)
                    ways++;
                if(j+1==v.size())
                    i++;
            }
            System.out.println(ways);
        }
    }
}

