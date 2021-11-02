public class ArithmeticCalculator {
    int number1 = 0;
    int number2 = 0;

    public ArithmeticCalculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

public int calculate(Operation operation){
        switch (operation){
            case ADD:
                return (number1 + number2);
            case SUBTRACT:
                return  (number1 - number2);
            case MULTIPLY:
                return (number1 * number2);
        }
        return 0;
}
}
