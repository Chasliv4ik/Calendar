import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Calendar c = new Calendar();
        System.out.print("Enter the number of the month ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tmp = br.readLine();
          if (tmp.isEmpty()){
              c.getCalendar(0);
          }else {
              c.getCalendar(Integer.parseInt(tmp));
          }


    }
}
