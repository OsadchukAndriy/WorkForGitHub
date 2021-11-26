public class TwoDimensionalArray {
    public static char symbol = 'X';

    public static char[][] getTwoDimensionalArray(int size) {
        int i = 0;
        int j = 0;

        char[][] cross = new char[size][size];
        for (i = 0; i < cross.length; i++) {
            for (j = 0; j < cross[i].length; j++) {

                cross[i][j] = (j == i || j == cross.length - 1 - i) ? symbol : ' ';
                System.out.print(cross[i][j]);
            }
            System.out.println();
        }

        return cross;
    }
}