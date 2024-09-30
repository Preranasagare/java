import java.util.*;
public class Prime
{
    public static void main(String [] args)
    {
        int N1 = 0, i = 0, Count = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number=");
        N1 = sc.nextInt();

        for( i = 2; i < N1; i++ )
        {
            if( N1 % i == 0 )
            {
                Count++;
                break;
            }
        }

        if( Count == 0 )
        {
            System.out.println("\n" + N1 + "is prime number");
        }

        else
        {  
            System.out.println("\n" + N1 + "is not prime number");
        }
    }
}