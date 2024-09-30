import java.util.*;
public class Percentage
{
    public static void main(String [] args)
    {
        int Subject1 = 0, Subject2 = 0, Subject3 = 0;
        float Per = 0; 
        int Total=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Subject1=");
        Subject1 = sc.nextInt();
        
        System.out.print("\n Subject2=");
        Subject2 = sc.nextInt();

        System.out.print("\n Subject3=");
        Subject3 = sc.nextInt();

        Total = Subject1 + Subject2 + Subject3;
        Per = (Total/3);
        System.out.print("\n Total Marks : "+Total+ ", Percentage :"+Per+" ");
    }
}