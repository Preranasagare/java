import java.util.*;
public class Array1
{
    public static void main(String [] args)
    {

        int [] numbers = {10, 20, 30, 40, 50};
        System.out.println("\n Array Length:" + numbers.length + "\n");

        for(int i = 0; i < numbers.length; i++)
        {
            System.out.println("\t Element at index" + i + ":" +numbers[i]);
        }

    }
}