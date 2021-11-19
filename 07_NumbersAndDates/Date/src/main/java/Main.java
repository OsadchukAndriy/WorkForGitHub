import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int day = 19;
        int month = 11;
        int year = 2020;
        System.out.println(collectBirthdays(year, month, day));
    }
    public static String collectBirthdays(int year, int month, int day) {

        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate now = LocalDate.now();
        String europeanDatePattern = ("dd.MM.yyyy - E");
        DateTimeFormatter europeanDateFormatter =  DateTimeFormatter.ofPattern(europeanDatePattern).localizedBy(new Locale("us"));
        String date = "";
        String dateTrim = "";
        int a;
        for ( a = 0; ; a++){
            if (birthday.isBefore(now) || birthday.isEqual(now))
            {
                date += a + " - " + europeanDateFormatter.format(birthday) + System.lineSeparator();
                birthday = birthday.plusYears(1);

            } else if (birthday.isAfter(now)){
                break;
            }
        }
        return date.trim();
    }}