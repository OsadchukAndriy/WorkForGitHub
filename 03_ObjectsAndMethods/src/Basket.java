public class Basket {

    private static int count = 0;
    private static int totalPrice;
    private String items = "";

    public static int getTotalPrice() {
        return totalPrice;
    }

    private int limit;
    private double totalWeight = 0;
    // статические переменные
    public static int totalCost = 0;
    public static int totalPriseBaskets = 0;
    public static int averagePrice = 0;
    public static int averagePriceBaskets = 0;
    // статические переменные
    //геттеры
    public static int getAveragePrice() {
        return averagePrice;
    }
    public static int getTotalPriseBaskets() {
        return totalPriseBaskets;
    }
    public static int getTotalCost() {
        return totalCost;
    }
    public static int getAveragePriceBaskets() {
        return averagePriceBaskets;
    }
    //геттеры
    // статические методы
    public static void  increaseTotalCost(int totalCost){
        Basket.totalCost = Basket.totalCost + totalCost;
    }
    public static void  increaseTotalPriseBaskets(int totalPriseBaskets){
        Basket.totalPriseBaskets = Basket.totalPriseBaskets + totalPriseBaskets;
    }
    public static void averagePriceBaskets(){
        averagePriceBaskets = totalPrice / count;
    }
    public static void averagePrice(){
        averagePrice = totalPriseBaskets / totalCost;
    }
    // статические методы

    public Basket() {
        increaseTotalCost(1);
        increaseTotalPriseBaskets(1);
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public void add(String name, int price) {
        add(name, price,1);
    }

    public void add(String name, int price, int count) {
        add(name, price, 1, 0);
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
                count + " шт. - " + price;
        totalPrice = totalPrice + count * price;
    }

    public void add(String name, int price, int count, double weight) {

        items = items + "\n" + name + " - " +
                count + " шт. - " + price + " - " + "Общий вес: " + weight * count + "кг.";
        totalPrice = totalPrice + count * price;
        totalWeight = totalWeight + weight;
    }


    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public double getTotalWeight(){
        return totalWeight;
    }


    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}
