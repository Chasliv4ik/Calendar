import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

public class Calendar {

    public void getCalendar() {

        LocalDate date = LocalDate.now();
        int firstDayOfWeek = DayOfWeek.from(LocalDate.of(date.getYear(), date.getMonth(), 1)).getValue();

        showHeadCalendar(date.getMonth(), Year.of(date.getYear()),firstDayOfWeek);

        for (int i = 1; i <= date.lengthOfMonth(); i++) {
            if (i == date.getDayOfMonth()) {
                System.out.print((char) 27 + "[31m");
                System.out.printf("%3d ", i);
                System.out.print((char) 27 + "[37m");
            } else {
                if (((i + firstDayOfWeek) % 7 == 0) || ((i - 1 + firstDayOfWeek) % 7 == 0) && (i != firstDayOfWeek)) {
                   textBlue();
                }
                System.out.printf("%3d ", i);
            }
         textWhite(i,firstDayOfWeek,date.lengthOfMonth());

        }

    }

    public void getCalendar(int month) {

        Month m = Month.of(month);
        Year y = Year.of(LocalDate.now().getYear());
        int lengthMonth = m.length(LocalDate.now().isLeapYear());
        int  firstDayOfWeek = DayOfWeek.from(LocalDate.of(y.getValue(), m.getValue(), 1)).getValue();

        showHeadCalendar(m,y,firstDayOfWeek);

        for (int i = 1; i <=lengthMonth; i++) {

            if ((i + firstDayOfWeek) % 7 == 0) textBlue();
            System.out.printf("%3d ", i);

               textWhite(i,firstDayOfWeek,lengthMonth);
        }

    }

    public void showHeadCalendar(Month m,Year y,int d){
        System.out.println(" CALENDAR FOR " + m + " " + y + " ");

        System.out.println(" Mon Tue Wed Thu Fri" + (char) 27 + "[34m Sat Sun " + (char) 27 + "[37m");

        for (int i = 1; i < d; i++)
            System.out.print("    ");
    }

    public void textBlue(){
        System.out.print((char) 27 + "[34m");
    }
    public void textWhite(int i,int d,int lengthMonth){
        if (((i - 1 + d) % 7 == 0) || (i == lengthMonth)) {
            System.out.println();
            System.out.print((char) 27 + "[37m");
        }
    }
}
