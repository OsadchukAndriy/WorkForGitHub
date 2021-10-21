public class Arithmetic {
    public int a = 2;
    public int b = 3;

    public Arithmetic(int number, int number1) {
        a = number;
        b = number1;
    }
    public int sum() {
        return a + b;
    }
    public int multiplication() {
        return a * b;
    }

    public int maxOfTwoNumbers(){
        if (a > b){
            return a;
        } else {
            return b;
        }
    }
    public  int minOfTwoNumbers(){
        if (a < b){
            return a;
        } else {
            return b;
        }
    }

}

