public class CardAccount extends BankAccount {


    @Override
    public boolean take(double amountToTake) {
        return super.take(amountToTake + amountToTake * 1 / 100);
    }


}
