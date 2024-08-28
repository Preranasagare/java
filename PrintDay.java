import java.util.*;
import java.lang.*;
public class PrintDay
{
    public static void main(String[]args)
    {
    int Day =0;
    String DayString ="";

            Scanner S = new Scanner(System.in);
            System.out.println("\n Enter Day Number");
            Day=S.nextInt();

      switch(Day)
    {
        case 1:
            DayString ="Monday";
            break;
            
        case 2:
            DayString ="Tuesday";
            break;

            case 3:
            DayString ="Wednsday";
            break; 

            case 4:
            DayString ="Thursday";
            break;
            
            case 5:
            DayString ="Firday";
            break;
            
            case 6:
            DayString ="Saturday";
            break;
           
           case 7:
            DayString ="Sunday";
            break;

            default:
                DayString="Invaild Day";
    }
         System.out.println("DayString");
}
}
        
        

