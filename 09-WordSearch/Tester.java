public class Tester{
  public static void main(String[] args) {
    WordSearch abcd = new WordSearch(10, 10);
    System.out.println(abcd.addWordHorizontal("Meat", 0, 5));
    System.out.println(abcd.addWordHorizontal("Meat", 0, 6));
    System.out.println(abcd.addWordHorizontal("Meat", 0, 7));
    System.out.println(abcd.addWordVertical("Meat", 3, 0));
    System.out.println(abcd.addWordVertical("Meat", 6, 0));
    System.out.println(abcd.addWordVertical("Meat", 7, 0));
    System.out.println(abcd.toString());
    System.out.println(abcd.addWordDiagonal("Meat", 7, 7));
    System.out.println(abcd.addWordDiagonal("Electric", 3, 4));
    System.out.println(abcd.addWordDiagonal("Mum", 2, 3));
  }
}
