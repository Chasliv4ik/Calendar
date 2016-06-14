import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calendar c = new Calendar();
        int month = 0;
        System.out.print("Enter the number of the month ");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt())
            month = scanner.nextInt();
        if (month >=1 && month<=12){
            c.getCalendar(month);
        }else
            c.getCalendar();


    }
}
