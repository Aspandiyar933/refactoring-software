public class WordCounter1 {
  public static void main(String[] args) {
    String text = "This is a simple text with several words";
    int count = 0;
    for (int i = 0; i < text.length(); i++) {
      if (text.charAt(i) == ' ') {
        count++;
      } 
    }
    count++;
    System.out.println("Word count: " + count);
  }
}