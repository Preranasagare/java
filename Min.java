import java.util.*;
public class Min
{
    public static void main(String [] args)
    {
        int Min = 0, i = 0;
        int [] Num = new int[]{10, 50, 15, 25, 30, 70};

        for(i=0; i<Num.length; i++)
        {
            if((i==0)||(Num[i]<Min))
            {
                Min=Num[i];
            }
        }
        System.out.println("\n Min is=" + Min);
    }
}