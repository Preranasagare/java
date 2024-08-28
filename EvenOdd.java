import java.util.*;
import java.lang.*;

public class EvenOdd
{
public static void main(String []args)
{
    int No = 0;
    Scanner S= new Scanner(System.in);
    System.out.println("\n Enter a number:");
     No = S.nextInt();
     if (No %  2 == 0)
    {
        System.out.println("\n Number is Even");
    }
    else
    {
        System.out.println("\n Number is Odd");
    }
    }
}