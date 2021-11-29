import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static TodoList todoList = new TodoList();

    public static void main(String[] args) {
        while (true){
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();


            Pattern p = Pattern.compile("(ADD|LIST|EDIT|DELETE) \\s*([0-9]*) \\s*(.+)*");
            Matcher m = p.matcher(line);
            if (!m.matches()) {
                System.out.println("Некоректный формат команды");
                continue;
            }
            String command = m.group(1);
            int index = !m.group(2).isBlank() ? Integer.parseInt(m.group(2)) : -1;
            String text = m.group(3);
            if(index != -1 && command.equals("ADD")){
                todoList.add(index, text);
                continue;
            }

            switch (command){
                case "LIST":
                    System.out.println();
                break;
                case "ADD":
                    System.out.println();
                    break;
                case "EDIT":
                    System.out.println();
                    break;
                case "DELETE":
                    System.out.println();
                    break;
            }
        }
        // TODO: написать консольное приложение для работы со списком дел todoList
    }
}
