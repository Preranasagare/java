import java.util.*;
public class Multiplication
{
    public static void main(String [] args)
    {
        int Number1 = 0, Number2 = 0, Mul = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Number1 =");
        Number1 = sc.nextInt();

        System.out.print("\n Number2 =");
        Number2 = sc.nextInt();

        Mul = Number1 * Number2;
        System.out.println("\n The result of adding  "+Number1+" &  "+Number2+" is : "+Mul+" ");


    }
}