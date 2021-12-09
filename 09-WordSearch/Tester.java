public class Tester{
  public static void main(String[] args) {
    WordSearch abcd = new WordSearch(10, 10);
    System.out.println(abcd.addWordHorizontal("Meat", 0, 5));
    System.out.println(abcd.addWordHorizontal("Meat", 0, 6));
    System.out.println(abcd.addWordHorizontal("Meat", 0, 7));
  }
}
