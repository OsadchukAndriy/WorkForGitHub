import java.util.*;

public class CoolNumbers {


    public static List<String> generateCoolNumbers() {
        ArrayList<String> coolNumbersList = new ArrayList<>();
        ArrayList<String> coolNumbersListWithoutRegion = new ArrayList<>();

        String numberplate = "";
        String numberplateWithoutRegion = "";

        char x; // первая буква
        char z; // вторая буква
        char y; // третья буква

        ArrayList<Character> allowedLetters = new ArrayList<>() {{
            add('А');
            add('В');
            add('Е');
            add('К');
            add('М');
            add('Н');
            add('О');
            add('Р');
            add('С');
            add('Т');
            add('У');
            add('Х');
        }};

        for (Character firstLetter : allowedLetters) {
            x = firstLetter;
            for (int n = 0; n < 10; n++) {
                for (Character secondLetter : allowedLetters) {
                    z = secondLetter;
                    for (Character thirdLetter : allowedLetters) {
                        y = thirdLetter;
                        numberplateWithoutRegion = String.format("%c%d%d%d%c%c", x, n, n, n, z, y);
                        coolNumbersListWithoutRegion.add(numberplateWithoutRegion);
                    }
                }
            }
        }

        for (String numberWithoutRegion : coolNumbersListWithoutRegion) {
            for (int j = 0; j <= 199; j++) {
                if (j < 10) {
                    numberplate = String.format("%s0%d", numberWithoutRegion, j);
                    coolNumbersList.add(numberplate);
                } else {
                    numberplate = String.format("%s%d", numberWithoutRegion, j);
                    coolNumbersList.add(numberplate);
                }
            }
        }

        return coolNumbersList;
    }


    public static boolean bruteForceSearchInList(List<String> list, String number) {

        for (String brut : list)
            if (brut.contains(number)) {
                return true;
            } else {
                return false;
            }
        return false;
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        Collections.sort(sortedList);
        for (String brut : sortedList) {
            Collections.binarySearch(sortedList, number);
            if (brut.contains(number)) {
                return true;
            }
        }
        return false;
    }


    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        for (String brut : hashSet)
            if (brut.contains(number)) {
                return true;
            }
        return false;
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        for (String brut : treeSet)
            if (brut.contains(number)) {
                return true;
            }
        return false;
    }

}
