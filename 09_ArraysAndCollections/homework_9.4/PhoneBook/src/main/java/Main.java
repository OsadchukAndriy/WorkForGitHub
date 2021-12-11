import java.util.Scanner;

public class Main {

    public static final String WRONG_EMAIL_ANSWER = "Неверный формат ввода";

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Введите номер, имя или команду: ");
            String input = scan.nextLine();

            if (input.matches("[А-Яа-я]+") && !phoneBook.mapPhoneBook.containsValue(input)) {
                System.out.println("Такого имени в телефонной книге нет.");
                System.out.println("Введите номер телефона для абонента \"" + input + "\":");
                String inTel = scan.nextLine();
                phoneBook.addContact(inTel, input);
                System.out.println("Контакт сохранен!");
                continue;
            } else if (input.matches("[0-9]{11}") && !phoneBook.mapPhoneBook.containsKey(input)) {
                System.out.println("Такого номера нет в телефонной книге.");
                System.out.println("Введите имя абонента для номера \"" + input + "\":");
                String inName = scan.nextLine();
                phoneBook.addContact(input, inName);
                System.out.println("Контакт сохранен!");
                continue;
            } else if (input.equals("LIST")) {
                System.out.println(phoneBook.getAllContacts());
                continue;
            } else if (!input.matches("[А-Яа-я]+") || !input.matches("[0-9]{11}")) {
                System.out.println(WRONG_EMAIL_ANSWER);
                continue;
            }
            if (input.equals("0")) {
                break;
            }
        }
    }
}
