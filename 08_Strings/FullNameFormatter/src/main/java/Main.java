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

      for(int a = 0; a < input.length(); a++){
        char symbol = input.charAt(a);
        if (symbol == ' '){
          spaceCount++;
        }
        if ((symbol == 32 || symbol == 45 || (symbol > 1048 && symbol < 1104)) && spaceCount == 2){
          printName = true;
        } else {
          printName = false;
        }

      }
      if (printName){
        System.out.println("Фамилия: " + secondName + "\nИмя: " + firstName + "\nОтчество: " + lastName );
      }
      else {
        System.out.println("Введенная строка не является ФИО");
      }

    }
  }
}


//TODO:напишите ваш код тут, результат вывести в консоль.
//При невалидном ФИО вывести в консоль: Введенная строка не является ФИО