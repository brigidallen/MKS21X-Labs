public class Border{
  private static void go(int row,int col){
      System.out.print("\u001b[" + row + ";" + col + "f");
  }
  public static void Border(){
    for(int i = 0; i < 80; i++){
      System.out.print("_");
    } System.out.println("");
    Text.go(2, 1);
    for(int i = 0; i < 80; i++){
      System.out.print("_");
    } System.out.println("");
    Text.go(3, 1);
    for(int i = 3; i < 30; i++){
      System.out.println("|");
    }
    Text.go(3, 3);
    for(int i = 3; i < 30; i++){
      Text.go(i, 3);
      System.out.println("|");
    }
    Text.go(3, 78);
    for(int i = 3; i < 30; i++){
      Text.go(i, 78);
      System.out.println("|");
    }
    Text.go(3, 80);
    for(int i = 3; i < 30; i++){
      Text.go(i, 80);
      System.out.println("|");
    } Text.go(26,1);
    for(int i = 0; i < 80; i++){
      System.out.print("_");
    } System.out.println("");
    Text.go(29,1);
    for(int i = 0; i < 80; i++){
      System.out.println("_");
    } System.out.println("");
  }
  public static void main(String[] args) {
    Border();
  }
}
