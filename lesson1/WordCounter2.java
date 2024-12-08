import java.util.StringTokenizer;

public class WordCounter2 {
  public static void main(String[] args) {
    String text = "This is a sample text with several words";    
    StringTokenizer tokenizer = new StringTokenizer(text);
    System.out.println("Word count: " + tokenizer.countTokens());
  }
}
