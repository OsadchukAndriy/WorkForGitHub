import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        break;
      }
      int spaceCount = 0;
      int firstSpace = input.indexOf(' ');
      int lastSpace = input.lastIndexOf(' ');
      String firstName = input.substring(firstSpace + 1, lastSpace);
      String secondName = input.substring(0, firstSpace);
      String lastName = input.substring(lastSpace + 1);
      boolean printName = false;

      System.out.println("Фамилия: " + firstName);
      System.out.println("Имя: " + secondName);
      System.out.println("Отчество: " + lastName);

    }
  }

}


//TODO:напишите ваш код тут, результат вывести в консоль.
//При невалидном ФИО вывести в консоль: Введенная строка не является ФИО