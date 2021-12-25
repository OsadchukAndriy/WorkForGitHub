public class CardAccount extends BankAccount {
    public static final double commissionPercent = 1;

    @Override
    public boolean take(double amountToTake) {
        return super.take(amountToTake + amountToTake * (commissionPercent / 100));
    }

}
