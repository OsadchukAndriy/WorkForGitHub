 public class Computer {
    private CPU cpu;
    private RAM ram;
    private InformationStorage informationStorage;
    private Screen screen;
    private Keyboard keyboard;
    private final String vendor;
    private final String name;

    public CPU getCpu() {
        return cpu;
    }
    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public RAM getRam() {
        return ram;
    }
    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public InformationStorage getInformationStorage() {
        return informationStorage;
    }
    public void setInformationStorage(InformationStorage informationStorage) {
        this.informationStorage = informationStorage;
    }

    public Screen getScreen() {
        return screen;
    }
    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }
    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public String getVendor() {
        return vendor;
    }
    public String getName() {
        return name;
    }

    public double getTotalWeight() {
        return totalWeight;
    }
    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public Computer(CPU cpu,
                    RAM ram,
                    InformationStorage informationStorage,
                    Screen screen, Keyboard keyboard,
                    String vendor,
                    String name,
                    double totalWeight) {
        this.cpu = cpu;
        this.ram = ram;
        this.informationStorage = informationStorage;
        this.screen = screen;
        this.keyboard = keyboard;
        this.vendor = vendor;
        this.name = name;
        this.totalWeight = totalWeight;
    }
    private double totalWeight;





    public double totalWeight(){
        totalWeight = cpu.getWeight() +
                      ram.getWeight() +
                      informationStorage.getWeight() +
                      screen.getWeight() +
                      keyboard.getWeight();
        return totalWeight;
    }


    public String toString(){
        return "Компютер: " + "/n"

                + "Процессор: "
                + "частота: " + cpu.getFrequency()
                + "количество ядер: " + cpu.getNumberOfCores() +
                "производитель: " + cpu.getManufacturer() +
                "вес" + cpu.getWeight() + "/n"

                + "Оперативная память: "
                + "тип: " + ram.getType()
                + "объём: " + ram.getVolume()
                + "вес: " + ram.getWeight() + "/n"

                + "Накопитель информации: "
                + "тип: " + informationStorage.getTypeMemory()
                + "объём памяти: " + informationStorage.getMemory()
                + "вес: " + informationStorage.getWeight() + "/n"

                + "Экран: "
                + "диагональ: " + screen.getDiagonal()
                + "тип: " + screen.getTypeScreen()
                + "вес: " + screen.getWeight() + "/n"

                + "Клавиатура: "
                + "тип: " + keyboard.getType()
                + "наличие подсветки: " + keyboard.isBacklight()
                + "вес: " + keyboard.getWeight();

    }
}
