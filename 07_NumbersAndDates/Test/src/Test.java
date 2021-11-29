import java.util.Scanner;



public class Test {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scan = new Scanner(System.in);
        int a = 0;
        boolean hasNextInt = true;
        while (hasNextInt){
            a = scan.nextInt();
            a++;
        }
        boolean isEnter = false;
        if(!isEnter){
            String d = scan.nextLine();
            d.equals("ENTER");
            System.out.println(a);
        }

    }
}