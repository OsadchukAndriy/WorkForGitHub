class Screen {
    private final double diagonal;
    private final String typeScreen;
    private final double weight;

    public double getDiagonal() {
        return diagonal;
    }
    public String getTypeScreen() {
        return typeScreen;
    }
    public double getWeight() {
        return weight;
    }

    public Screen(double diagonal, String typeScreen, double weight) {
        this.diagonal = diagonal;
        this.typeScreen = typeScreen;
        this.weight = weight;
    }
}
