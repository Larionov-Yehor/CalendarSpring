/**
 * Created by employee on 11/21/16.
 */
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;


/**
 * Created by employee on 11/3/16.
 */
public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(new String[] {"config.xml"});
        Calendar consoleCalendar =(Calendar)ac.getBean("consoleCalendar");

        consoleCalendar.print();

        Calendar htmlCalendar = (Calendar) ac.getBean("htmlCalendar");
        htmlCalendar.print();

    }
}