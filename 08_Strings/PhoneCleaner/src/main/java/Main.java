import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }

            String number = "[^0-9]";
            String number2 = "[0-9]{10,11}";

            String replace = input.replaceAll(number, "");
            char cha = replace.charAt(0);

            if (!replace.matches(number2)) {
                System.out.println("Неверный формат номера");
            } else if (replace.length() == 10) {
                System.out.println("7" + replace);
            } else if (replace.charAt(0) == '8' && replace.length() == 11) {
                System.out.println(replace.replaceFirst(String.valueOf(cha), "7"));
            } else if (replace.length() == 11 && cha == '9') {
                System.out.println("Неверный формат номера");
            } else {
                System.out.println(replace);
            }
        }
    }
}