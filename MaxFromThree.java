import java.util.*;
import java.lang.*;
 public class MaxFromThree
{
public static void main(String []args)
{
    int N1,N2,N3;
    Scanner S=new Scanner(System.in);
    System.out.print("\n Enter 1st no:");
    N1=S.nextInt();
     System.out.print("\n Enter 2nd no:");
    N2=S.nextInt();
    System.out.print("\n Enter 3rd no:");
    N3=S.nextInt();
    if (N1>N2 && N2>N3)
    {
        System.out.print(" largest Number is "+N1);
      }
      else if(N1>N2)
      {
         System.out.print("largest Number is "+N2);
    }
    else 
    {
         System.out.print(" largest Number is "+N3  );  
    }
    System.out.print("\n Thankyou:");
    }

}

