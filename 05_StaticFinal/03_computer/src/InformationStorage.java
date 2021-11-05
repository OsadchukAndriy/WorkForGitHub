class InformationStorage {
    private final String typeMemory;
    private final double memory;
    private final double weight;

    public String getTypeMemory() {
        return typeMemory;
    }
    public double getMemory() {
        return memory;
    }
    public double getWeight() {
        return weight;
    }

    public InformationStorage(String typeMemory, double memory, double weight) {
        this.typeMemory = typeMemory;
        this.memory = memory;
        this.weight = weight;
    }
}
