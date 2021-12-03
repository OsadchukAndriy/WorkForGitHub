import java.util.Locale;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        EmailList emailList = new EmailList();

        while (true) {
            String input = scan.nextLine();
            if (input.equals("0")) {
                break;
            }
            Pattern p = Pattern.compile("(ADD|LIST)\\\\s?(.*)");
            Matcher m = p.matcher(input);
            String emailAdress = m.group(2).toLowerCase();
            String command = m.group(1);

            if (!m.matches()) {
                System.out.println(WRONG_EMAIL_ANSWER);
                break;
            }
            switch (command) {
                case "LIST":
                    emailList.getSortedEmails();
                case "ADD":
                    emailList.add(emailAdress);
                    break;

            }
        }
    }
}