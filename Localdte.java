import java.time.LocalDate;
import java.time.LocalTime;

public class Localdte {
    public static void main(String[] args) {
        LocalDate ll= LocalDate.now();
        System.out.println(ll);
        LocalTime lll=LocalTime.now();
        System.out.println(lll);
        //comparing dates
        if (ll.isAfter(ll.minusDays(10)))
        System.out.println("Today's date is after 10 days ago from yesterday");
        else
        System.out.println("Today's date is not after 10 days ago from yesterday");
        //adding and subtracting days, months and years to a date
        System.out.println("Adding 5 days to today's date: "+ll
        .plusDays(5));
        System.out.println("Subtracting 3 days from today's date:"+ll.minusDays(3));
        System.out.println("\nAdding 2 months to current month: "+
        ll.plusMonths(2));
        System.out.println("Subtracting 4 months from the current month:"+
        ll.minusMonths(4));
        System.out.println("Adding 1 year to the current year: "+
        ll.plusYears(1));
        System.out.println("Getting the day of the week for tomorrow:\n"+
        ll.plusDays(1).getDayOfWeek());
        


    }
}