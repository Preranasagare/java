import java.util.*;
import java.lang.*;

 public class Addition

{
    public static void main(String []args)
    {
        int N1= 0, N2= 0, sum= 0;
        Scanner s = new Scanner(System.in);
        System.out.println("\n Enter 1st no : ");
        N1 = s.nextInt();
         System.out.println("\n Enter 2nd no : ");
         N2 = s.nextInt();
         sum=N1 + N2;
         
         

         System.out.println("\n Addition of" +N1 +"&" +N2+ "is="+sum);
    }
}