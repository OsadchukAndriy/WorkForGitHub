import java.time.LocalDate;
import java.time.Period;

public class Main {

    public static void main(String[] args) {

        LocalDate birthday = LocalDate.of(1995, 5, 23);

        System.out.println(getPeriodFromBirhday(birthday));
    }
        private static String getPeriodFromBirhday(LocalDate birthday) {


            LocalDate now = LocalDate.now();
            Period period = Period.between(birthday, now);

            return period.getYears() + " years, " + period.getMonths() + " months, " + period.getDays() + " days";

        }


        //TODO реализуйте метод для построения строки в следующем виде
        //0 - 31.12.1990 - Mon
        //1 - 31.12.1991 - Tue
    }

