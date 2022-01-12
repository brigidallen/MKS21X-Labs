public class Border{
  private static final int WIDTH = 80;
  private static final int HEIGHT = 30;
  private static final int BORDER_COLOR = Text.CYAN;
  private static final int BG_COLOR = Text.BLUE + Text.BACKGROUND;

  public static int[] makeRand(int length){
    int[] randarr = new int[length];
    for(int i = 0; i < randarr.length; i++){
      randarr[i] = (int)(Math.random()*100+1);
    } return randarr;
  }
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
    Text.go(29,1);
    for(int i = 0; i < 80; i++){
      System.out.print("_");
    } System.out.println("");
    Text.go(30,1);
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
    }
  }
  public static void printRand(){
    int[] randarr = makeRand(4);
    for(int i = 0; i < randarr.length; i++){
      Text.go(4, i*20+10);
      if(randarr[i] < 25){
        System.out.println(Text.colorize(Integer.toString(randarr[i]), Text.RED));
      } else if(randarr[i] > 75){
        System.out.println(Text.colorize(Integer.toString(randarr[i]), Text.GREEN));
      } else{
        System.out.println(Text.colorize(Integer.toString(randarr[i]), Text.WHITE));
      }
    }
  }
  public static void main(String[] args) {
    Border();
    printRand();
  }
}
