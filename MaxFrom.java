import java.util.*;
import java.lang.*;
public class MaxFrom
{
public static void main(String []args)
{
    int N1=0,N2=0;
    Scanner S=new Scanner(System.in);
    System.out.print("\n Enter 1st no:");
    N1=S.nextInt();
     System.out.print("\n Enter 2nd no:");
    N2=S.nextInt();
    if (N1==N2)
    {
        System.out.print("\n Both No are Equal :");
      }
      else if(N1>N2)
      {
         System.out.print("\n No "+ N1 + " is maximum:");
    }
    else 
    {
         System.out.print("\n No " + N2 + " is maximum:");  
    }
    System.out.print("\n Thankyou:");
    }

}

