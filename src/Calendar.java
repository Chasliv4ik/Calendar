import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

public class Calendar {
    public void getCalendar() {

        LocalDate date = LocalDate.now();
        DayOfWeek firstDayOfWeek = DayOfWeek.from(LocalDate.of(date.getYear(), date.getMonth(), 1));
        showHeadCalendar(date.getMonth(), Year.of(date.getYear()),firstDayOfWeek);
        for (int i = 1; i <= date.lengthOfMonth(); i++) {
            if (i == date.getDayOfMonth()) {
                System.out.print((char) 27 + "[31m");
                System.out.printf("%3d ", i);
                System.out.print((char) 27 + "[37m");
            } else {
                if (((i + firstDayOfWeek.getValue()) % 7 == 0) || ((i - 1 + firstDayOfWeek.getValue()) % 7 == 0) && (i != firstDayOfWeek.getValue())) {
                    System.out.print((char) 27 + "[34m");
                }
                System.out.printf("%3d ", i);
            }
            if (((i - 1 + firstDayOfWeek.getValue()) % 7 == 0) || (i == date.lengthOfMonth()))
                System.out.println((char) 27 + "[37m");
        }

    }

    public void getCalendar(int month) {

        Month m = Month.of(month);

        Year y = Year.of(LocalDate.now().getYear());

        DayOfWeek firstDayOfWeek = DayOfWeek.from(LocalDate.of(y.getValue(), m.getValue(), 1));
        showHeadCalendar(m,y,firstDayOfWeek);
        for (int i = 1; i <= m.length(LocalDate.now().isLeapYear()); i++) {

            if ((i + firstDayOfWeek.getValue()) % 7 == 0) System.out.print((char) 27 + "[34m");

            System.out.printf("%3d ", i);

            if (((i - 1 + firstDayOfWeek.getValue()) % 7 == 0) || (i == m.length(LocalDate.now().isLeapYear())))
                System.out.println((char) 27 + "[37m");
        }

    }

    public void showHeadCalendar(Month m,Year y,DayOfWeek d){
        System.out.println(" CALENDAR FOR " + m + " " + y + " ");

        System.out.println(" Mon Tue Wed Thu Fri" + (char) 27 + "[34m Sat Sun " + (char) 27 + "[37m");

        for (int i = 1; i < d.getValue(); i++)
            System.out.print("    ");
    }
}
