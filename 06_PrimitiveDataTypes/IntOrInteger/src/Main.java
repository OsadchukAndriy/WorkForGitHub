public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        for(int i = 'А'; i <= 'я'; i++){
            System.out.println("У буквы - " + (char)i + " код - " + i);
        }
        System.out.println("У буквы - " + 'Ë' + " код - " + (int)'Ë');
        System.out.println("У буквы - " + 'e' + " код - " + (int)'e');


        // TODO: ниже напишите код для выполнения задания:
        //  С помощью цикла и преобразования чисел в символы найдите все коды
        //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё.

    }
}
