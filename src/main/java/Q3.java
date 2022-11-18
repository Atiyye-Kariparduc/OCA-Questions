import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q3 {
    public static void main(String[] args) {
        String time="2016-11-01";
        String date = LocalDate
                .parse(time)
                .format(DateTimeFormatter.ofPattern(DateTimeFormatter.ISO_DATE_TIME.format(LocalDate.parse(time)).toString()));
        System.out.println(date);

    }
    /*
What is the result?
A. May 04, 2014T00:00:00.000
B. 2014-05-04T00:00: 00.000
C. 5/4/14T00:00:00.000
D. An exception is thrown at runtime.
Answer: D
*/
}
