import java.util.*;
public class Stud_Info
{
    public static void main(String [] args)
    {
        String Stud_Name, Course_Name, City;
        int Roll_No;
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Enter Student Name=");
        Stud_Name = sc.nextLine();

        System.out.print("\n Enter Roll Number=");
        Roll_No = sc.nextInt();

        System.out.print("\n Enter Course Name=");
        Course_Name = System.console().readLine();

        System.out.print("\n Enter City Name=");
        City = System.console().readLine();

        System.out.println("\n Student Name :"+Stud_Name+" \n Roll Number : "+Roll_No+" \n Course Name : "+Course_Name+" \n City : "+City+" ");
    }
}