class Delivery {
    private final double dimensions;
    private final double weight;
    private final String deliveryAddress;
    private final boolean isItPossibleToFlip;
    private final String registrationNumber;
    private final boolean fragileСargo;

    public Delivery setDeliveryAddress(String deliveryAddress){
        return new Delivery(dimensions, weight, deliveryAddress, isItPossibleToFlip, registrationNumber, fragileСargo);
    }
    public Delivery setDimensions(double dimensions){
        return new Delivery(dimensions, weight, deliveryAddress, isItPossibleToFlip, registrationNumber, fragileСargo);
    }
    public Delivery setWeight(double weight){
        return new Delivery(dimensions, weight, deliveryAddress, isItPossibleToFlip, registrationNumber, fragileСargo);
    }

    public double getDimensions() {
        return dimensions;
    }

    public double getWeight() {
        return weight;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public boolean isItPossibleToFlip() {
        return isItPossibleToFlip;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean isFragileСargo() {
        return fragileСargo;
    }

    public Delivery(double dimensions,
                    double weight,
                    String deliveryAddress,
                    boolean isItPossibleToFlip,
                    String registrationNumber,
                    boolean fragileСargo) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.isItPossibleToFlip = isItPossibleToFlip;
        this.registrationNumber = registrationNumber;
        this.fragileСargo = fragileСargo;
    }
}
