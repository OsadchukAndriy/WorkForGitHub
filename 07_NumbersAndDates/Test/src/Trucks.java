public class Trucks {
    private static final int MAX_CONTAINERS = 12;
    private  static final int MAX_BOXES = 27;
    private  static int sumBoxes;
    private static double needTrucks;
    private static double needContainers;

    // Подсчет нужного колличества контейнеров и грузовиков.
    public static void needTrucks(double boxes){
        sumBoxes = (int) boxes;
        needContainers = (int) Math.ceil(boxes / MAX_BOXES);
        needTrucks = Math.ceil(needContainers / MAX_CONTAINERS);

        System.out.println("Ящиков всего: " + sumBoxes);
        System.out.println("Нужно контейнеров: " + (int) needContainers);
        System.out.println("Нужно грузовиков: " + (int) needTrucks);
    }

    public static void loadStuff(){

        for(int trucksNow = 1, outContCount = 1, outCountBoxes = 1; sumBoxes != 0; sumBoxes--){

            if(sumBoxes % needTrucks == 0){

                System.out.println("Грузовик " + trucksNow);
                needTrucks--;
                trucksNow++;

                System.out.println("\tКонтейнер " + outContCount);
                needContainers--;
                outContCount++;

                System.out.println("\t\tЯщик " + outCountBoxes);
                sumBoxes--;
                outCountBoxes++;
            }

            if(sumBoxes % needContainers == 0){
                System.out.println("\tКонтейнер " + outContCount);
                needContainers--;
                outContCount++;

                System.out.println("\t\tЯщик " + outCountBoxes);
                sumBoxes--;
                outCountBoxes++;
            }


            System.out.println("\t\tЯщик " + outCountBoxes);
            outCountBoxes++;

        }

/*            for (int trucksNow = 1; trucksNow <= (int) needTrucks; trucksNow++ ){
            System.out.println("Грузовик " + trucksNow);

                for (int outContCount = 1; needContainers != 0; needContainers--){
                    if (outContCount > 12)break;
                    System.out.println("\tКонтейнер " + outContCount);

                    for (int outCountBoxes = 1; sumBoxes != 0; sumBoxes--){
                        if (outCountBoxes > 27)break;
                        System.out.println("\t\tЯщик " + outCountBoxes);

                        outCountBoxes++;
                    }
                    outContCount++;
                }
            }*/
    }
}

