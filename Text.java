public class Text{
  /*Base colors*/
  private static int BLACK = 30;
  private static int RED = 31;
  private static int GREEN = 32;
  private static int YELLOW = 33;
  private static int BLUE = 34;
  private static int MAGENTA = 35;
  private static int CYAN = 36;
  private static int WHITE = 37;

  /*Text modifiers to be ADDED to a color*/
  private static int BACKGROUND = 10;
  private static int BRIGHT = 60;

  /*Text modifiers that are separate from color*/
  private static int BOLD = 1;
  private static int UNDERLINE = 4;
  private static int INVERTED = 7;

  /*Reset colors*/
  public static void reset(){
    System.out.print("\u001b[0m");
  }


  public static void hideCursor(){
    System.out.print("\u001b[?25l");
  }

  public static void showCursor(){
    System.out.print("\u001b[?25h");
  }

  /*Move the cursor to a specified row/col on the terminal*/
  public static void go(int row,int col){
      System.out.print("\u001b[" + row + ";" + col + "f");
  }

  /*Erases all text on the terminal.*/
  public static void clear(){
    System.out.print("\u001b[2J");
  }

  /*Overloaded Colorize methods.
    c1,c2 and c3 are any color modifiers such as bold/color/background color etc.
  */
  public static String colorize(String text,int c1){
    return ("\u001b[" + c1 + "m"+text+"\u001b[0m");
  }
  public static String colorize(String text,int c1,int c2){
    return ("\u001b[" + c1 + ";" + c2 + "m"+text+"\u001b[0m");
  }
  public static String colorize(String text,int c1,int c2,int c3){
    return ("\u001b[" + c1 + ";" + c2 + ";" + c3 + "m"+text+"\u001b[0m");
  }


  //Tested and working in:
  //git-bash (windows 10),    wsl (windows 10+11),   powershell windows 11
  public static void main(String[] args) {
    hideCursor();
    clear();

    go(1,1);
    System.out.println("Abra cadabra hocus pocus...");
    System.out.println("Abra "+colorize("cadabra",BOLD,YELLOW+BRIGHT,BLUE+BACKGROUND)+" hocus pocus...");
    System.out.println(colorize("Abra",BOLD,BLACK,YELLOW+BACKGROUND+BRIGHT)+" cadabra hocus pocus...");

    go(1,1);//top left
    System.out.print("TOP!");//overwrites the "Abra" on line 1

    go(4,30);
    System.out.print("right?");

    go(5,1);//put the terminal at the end of the output again before the program ends.
    reset();
    showCursor();
  }
}
