public class Main {

  public static void main(String[] args) {

    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

    //TODO: напишите ваш код, результат вывести в консоль
    System.out.println(Integer.parseInt(getEncoding(text).trim())
            + Integer.parseInt(getEncoding2(text).trim())
            + Integer.parseInt(getEncoding3(text).trim()));
  }
  public static String getEncoding(String text){
    String a = "л";
    int start = text.indexOf(a) + a.length();
    int end = text.indexOf("р" , start);
    String encoding = text.substring(start, end);
    return encoding;
  }
  public static String getEncoding2(String text){
    String a = "-";
    int start = text.indexOf(a) + a.length();
    int end = text.indexOf("р" , start);
    String encoding2= text.substring(start, end);
    return encoding2;

}
  public static String getEncoding3(String text){
    String a = "ша -";
    int start = text.indexOf(a) + a.length();
    int end = text.indexOf("р" , start);
    String encoding3= text.substring(start, end);
    return encoding3;
}}