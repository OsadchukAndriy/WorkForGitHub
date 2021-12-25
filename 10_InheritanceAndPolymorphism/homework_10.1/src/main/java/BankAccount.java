public class BankAccount {
    public double amount = 0;
    public double getAmount() {
        return amount;
    }
    public boolean put(double amountToPut) {
        if (amountToPut < 0) {
            getAmount();
            return true;


        } else {
            amount = getAmount() + amountToPut;
            System.out.println(getAmount());
            return false;
        }
    }
    public boolean take(double amountToTake) {
        if (amountToTake < amount) {
            amount -= amountToTake;
            System.out.println(getAmount());
            return true;
        } else {
            System.out.println(getAmount());
            return false;
        }
    }
}
