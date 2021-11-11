import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        final int CONTAINERS_IN_TRUCK = 12;
        final int BOXES_IN_CONTAINER = 27;
        int containersCount = w / BOXES_IN_CONTAINER;
        int trucksCount = containersCount / CONTAINERS_IN_TRUCK;
        int box = 0;
        for (int  i = 0; i < trucksCount; i++) {
            System.out.println("Грузовик: " + (i + 1));
            for (int j = 0; j < CONTAINERS_IN_TRUCK; j++) {
                System.out.println("\tКонтейнер: " + (j + 1));
                for (int k = 0; k < BOXES_IN_CONTAINER; k++) {
                    System.out.println("\t\tЯщик: " + (box + 1));
                    box++;
                }
            }
        }
        if (w % (BOXES_IN_CONTAINER * CONTAINERS_IN_TRUCK) > 0){
            System.out.println("Грузовик: " + (trucksCount + 1));
            int fullContainer = w / BOXES_IN_CONTAINER % CONTAINERS_IN_TRUCK;
            for (int j = 0; j < fullContainer; j++){
                System.out.println("\tКонтейнер: " + (j + 1));
                for (int k = 0; k < BOXES_IN_CONTAINER; k++) {
                    System.out.println("\t\tЯщик: " + (box + 1));
                    box++;
                }
            }
            if (w % BOXES_IN_CONTAINER > 0){
                System.out.println("\tКонтейнер: " + (fullContainer + 1));
                for (int k = 1; k < w % BOXES_IN_CONTAINER; k++){
                    System.out.println("\t\tЯщик: " + (box + 1));
                    box++;
                }
            }
        }
        System.out.println("Необходимо: ");
        System.out.println("грузовиков: " + (trucksCount + ((w % (BOXES_IN_CONTAINER * CONTAINERS_IN_TRUCK)) > 0 ? 1 : 0 )) + "шт.");
        System.out.println("контейнеров: " + (containersCount + ((w % BOXES_IN_CONTAINER) > 0 ? 1 : 0 )) + "шт.");
    }
}
// сделать все наоборот від білшого до меншого!!!!!!!!!!!!!!!!!!!!!!!!!

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */