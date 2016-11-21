/**
 * Created by employee on 11/21/16.
 */
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by employee on 11/3/16.
 */
public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(new String[] {"config.xml"});
        Calendar calendar =(Calendar)ac.getBean("consoleCalendar");
        calendar.print();


    /*    LocalDate localDate = LocalDate.of(2016,9,1);

        Calendar consoleCalendar = new ConsoleCalendar(localDate);

        consoleCalendar.setWeekStart(DayOfWeek.WEDNESDAY);

        consoleCalendar.print();

       // Calendar htmlCalendar = new HtmlCalendar(LocalDate.now(), DayOfWeek.MONDAY);

       // htmlCalendar.print();*/

    }
}