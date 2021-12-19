import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Main {
    /*
    TODO:
     - реализовать методы класса CoolNumbers
     - посчитать время поиска введимого номера в консоль в каждой из структуры данных
     - проанализоровать полученные данные
     */

    public static final String TRUE = "найден";
    public static final String WRONG = "не найден";

    public static void main(String[] args) {
        CoolNumbers coolNumbers = new CoolNumbers();
        String number = new String();
        List<String> list = new ArrayList<>();
        HashSet<String> hash = new HashSet<>();
        TreeSet<String> tree = new TreeSet<>();

        long start = System.nanoTime();
        coolNumbers.bruteForceSearchInList(list, number);
        long g = (System.nanoTime() - start);
        if (true) {
            System.out.println("Поиск перебором: " + TRUE + " поиск занял " + g);
        } else {
            System.out.println("Поиск перебором: " + WRONG + " поиск занял " + g);
        }
        long start1 = System.nanoTime();
        coolNumbers.binarySearchInList(list, number);
        long d = (System.nanoTime() - start1);
        if (true) {
            System.out.println("Поиск перебором: " + TRUE + " поиск занял " + d);
        } else {
            System.out.println("Поиск перебором: " + WRONG + " поиск занял " + d);
        }
        long start2 = System.nanoTime();
        coolNumbers.searchInHashSet(hash, number);
        long q = (System.nanoTime() - start2);
        if (true) {
            System.out.println("Поиск перебором: " + TRUE + " поиск занял " + q);
        } else {
            System.out.println("Поиск перебором: " + WRONG + " поиск занял " + q);
        }
        long start3 = System.nanoTime();
        coolNumbers.searchInTreeSet(tree, number);
        long j = (System.nanoTime() - start3);
        if (true) {
            System.out.println("Поиск перебором: " + TRUE + " поиск занял " + j);
        } else {
            System.out.println("Поиск перебором: " + WRONG + " поиск занял " + j);
        }
    }


}



