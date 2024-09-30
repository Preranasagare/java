import java.util.*;
class Area_Of_Circle
{
    public static void main(String [] args)
    {
        float Radius = 0;
        double Area = 0;
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Enter the radius=");
        Radius = sc.nextFloat();

        Area = 3.14 * Radius * Radius;
        System.out.println("Area of Circle is="+Area+"");
    }
}