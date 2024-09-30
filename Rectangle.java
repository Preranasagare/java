import java.util.*;
class Rectangle
{
    public static void main(String [] args)
    {
        float Width = 0, Height = 0;
        double Area = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Width=");
        Width = sc.nextFloat();

        System.out.print("Enter Height=");
        Height = sc.nextFloat();

        Area = Width * Height;
        System.out.println("Area:"+Area+"");
    }
}