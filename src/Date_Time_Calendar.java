import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.File;
import java.io.IOException;
public class Date_Time_Calendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR_OF_DAY) +":"+ c.get(Calendar.MINUTE)+":"+ c.get(Calendar.SECOND));
        GregorianCalendar calc = new GregorianCalendar();
        System.out.println(calc.isLeapYear(2022));
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        DateTimeFormatter dfz = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        String myDaate = dt.format(dfz);
        System.out.println(myDaate);
        try {
            File myfile = new File("DateTimeCalendar.txt");
            if (myfile.createNewFile()) {
                System.out.println("File created :" + myfile.getName());
            } else {
                System.out.println("File alraedy exists");
            }
        }
        catch (IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
