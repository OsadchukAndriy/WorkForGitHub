import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int day = 1;
        int month = 12;
        int year = 1995;
        System.out.println(collectBirthdays(year, month, day));
    }
    public static String collectBirthdays(int year, int month, int day) {

        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate now = LocalDate.now();
        String europeanDatePattern = ("dd.MM.yyyy - E");
        DateTimeFormatter europeanDateFormatter =  DateTimeFormatter.ofPattern(europeanDatePattern).localizedBy(new Locale("us"));
        String date = "";

        // for (int i = 0; birthday.plusYears(i).getYear() <= now.getYear(); i++) {
        //     date = (i + " - " + europeanDateFormatter.format(birthday.plusYears(i)));
        //    System.out.println(date);

        int i = 0;
        while (birthday.plusYears(i).getYear() <= now.getYear()){
            date = (i + " - " + europeanDateFormatter.format(birthday.plusYears(i)));
            i++;
            System.out.println(date);
        }
        return date;
    }

}