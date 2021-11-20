public class Main {

  public static void main(String[] args) {
    splitTextIntoWords("Корректность работы программы независимо от передаваемого ей на вход текста");
  }

  public static String splitTextIntoWords(String text) {
    //TODO реализуйте метод
    String string = "";
    StringBuilder buil = new StringBuilder();
    String[] words = text.split("[\\s |\\,|\\.|;|'|\\-|[0-9]\\s]");
    for(int i = 0; i < words.length; i++){
      if (words[i] == ""){
        words[i].split("[\\s]");
      } else {
        buil.append(words[i].trim() + System.lineSeparator());
      }}
    string = "" + buil;
    return string.trim();
  }}
