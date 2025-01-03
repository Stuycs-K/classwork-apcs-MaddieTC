public class words {
  public static void makeWords(int remainingLetters, String result, String alphabet){
    if (remainingLetters == 0) {
      System.out.println(result);
    }
    else {
      for (int y = 0; y < alphabet.length(); y++) {
        result = result + alphabet.charAt(y);
        makeWords(remainingLetters - 1, result, alphabet);
      }
    }
  }
  public static void main(String[] args) {
    makeWords(1, "", "abc");
  }
}
