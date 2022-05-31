import java.util.Calendar;

public class Greet {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        int hour = now.get(Calendar.HOUR_OF_DAY);

        if (4 <= hour && hour < 12) {
            System.out.println("Good Morning");
        }
        if (12 <= hour && hour < 18) {
            System.out.println("Good Afternoon");
        }
        if (18 <= hour && hour < 22) {
            System.out.println("Good Evening");
        }
        else {
            System.out.println("Good Night");
        }
    }
}
