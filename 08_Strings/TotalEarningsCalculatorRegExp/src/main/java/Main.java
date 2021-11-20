import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {
    calculateSalarySum("Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей");
  }

  public static int calculateSalarySum(String text){

    Pattern pattern = Pattern.compile("\\d+");
    Matcher matcher = pattern.matcher(text);
    int sum = 0;
    while(matcher.find()){
      int start = matcher.start();
      int end = matcher.end();
      String result = text.substring(start, end);
      int number = Integer.parseInt(result);
      sum = sum + number;
    }
    //TODO: реализуйте метод
    return sum;
  }

}