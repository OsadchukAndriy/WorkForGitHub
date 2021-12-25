import java.time.LocalDate;

public class DepositAccount extends BankAccount {
    private LocalDate lastIncome = LocalDate.now();
    public boolean put(double amountToPut, LocalDate start) {
        lastIncome = start;
        return super.put(amountToPut);
    }

    @Override
    public boolean put(double amountToPut) {
        return this.put(amountToPut, LocalDate.now());
    }

    public boolean take(double amountToTake, LocalDate end) {
        if (lastIncome == null) {
            return false;
        } else if (lastIncome.plusMonths(1).isBefore(end)) {
            return super.take(amountToTake);
        }
        return false;
    }

    @Override
    public boolean take(double amountToTake) {
        return this.take(amountToTake, LocalDate.now());
    }

}


