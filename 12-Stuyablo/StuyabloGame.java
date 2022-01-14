import java.util.*;
public class StuyabloGame{
  private static final int WIDTH = 80;
  private static final int HEIGHT = 30;
  private static final int BORDER_COLOR = Text.BLACK;
  private static final int BORDER_BACKGROUND = Text.WHITE + Text.BACKGROUND;

  public static void main(String[] args) {
    run();
  }

  //Display a List of 1-4 adventurers on the rows row through row+3 (4 rows max)
  //Should include Name and HP on 2 separate lines. (more to be added later)
  public static void drawParty(ArrayList<Adventurer> party,int startRow){
    int colnum = (WIDTH - 6)/4;
    for(int i = 0; i < party.size(); i++){
      Text.go(startRow, i*colnum+3);
      System.out.print(party.get(i).getName());
      Text.go(startRow+1, i*colnum+3);
      System.out.print(party.get(i).getHP());
      System.out.println("  ");
    }
  }

  //Display a line of text starting at column 2 of the specified row.
  public static void drawText(String s,int startRow){
    /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
    //YOUR CODE HERE
    /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/
  }
  //Adventurers you control:


  public static void drawScreen(){
    Border.Border();
  }


  public static void run(){
    //Clear and initialize
    Text.hideCursor();
    Text.clear();
    Text.go(1,1);

    //Things to attack:
    //Make an ArrayList of Adventurers and add 1 enemy to it.
    ArrayList<Adventurer>enemies = new ArrayList<>();
    /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
    //YOUR CODE HERE
    /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/
    //Make an ArrayList of Adventurers and add 3 Adventurers to it.
    ArrayList<Adventurer> party = new ArrayList<>();
    Adventurer Maddie = new Warrior("Maddie", "You b word", 30, 50, 60);
    Adventurer Brett = new Warrior("Brett", "Bro I swear to god", 40, 50, 80);
    Adventurer Bethelda = new Wizard("Bethelda", "Math", 70, 90, 30);
    Adventurer Ramona = new Wizard("Ramona", "Rock", 60, 70, 60);
    party.add(Maddie);
    party.add(Brett);
    party.add(Bethelda);
    party.add(Ramona);

    //Main loop
    boolean partyTurn = false;
    int whichPlayer = 0;
    int turn = 0;
    String input = "";
    Scanner in = new Scanner(System.in);
    while(! (input.equalsIgnoreCase("q") || input.equalsIgnoreCase("quit"))){

      //Draw the window border
      Text.hideCursor();
      drawScreen();

      //display event based on last turn's input
      if(partyTurn){
        //Process user input:
        if(input.equals("attack")){
          /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
          //YOUR CODE HERE
          /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/
        }
        else if(input.equals("special")){
          /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
          //YOUR CODE HERE
          /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/
        }
        whichPlayer++;



        if(whichPlayer < party.size()){
          drawText("Enter command for "+party.get(whichPlayer)+": attack/special/quit",HEIGHT/2);
        }else{
          drawText("press enter to see monster's turn",HEIGHT/2);
          partyTurn = false;
        }
      }else{
        //this block ignores user input!
        //display enemy attack except on turn 0.
        if(turn > 0){
          //Enemy action choices go here!
          /*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
          //YOUR CODE HERE
          /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/
        }

        //after enemy goes, change back to player's turn.
        partyTurn=true;
        whichPlayer = 0;
        //display which player's turn is next and prompt for action.
        drawText("Enter command for "+party.get(whichPlayer)+": attack/special/quit",HEIGHT/2);

        //end the turn.
        turn++;

      }

      //display current state of all Adventurers
      drawParty(party,3);
      drawParty(enemies,HEIGHT-4);

      //Draw the prompt
      Text.reset();
      Text.go(HEIGHT+1,1);
      Text.showCursor();
      System.out.println("What just happened");
      System.out.print(">");
      //Read user input
      input = in.nextLine();
    }

    //After quit reset things:
    Text.reset();
    Text.showCursor();
    Text.go(32,1);
  }




}
