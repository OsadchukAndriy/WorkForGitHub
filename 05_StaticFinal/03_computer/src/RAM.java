 class RAM {
    private final String type;
    private final double volume;
    private final double weight;

     public String getType() {
         return type;
     }
     public double getVolume() {
         return volume;
     }
     public double getWeight() {
         return weight;
     }

     public RAM(String type, double volume, double weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }
}
