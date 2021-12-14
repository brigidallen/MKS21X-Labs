import java.util.*;
import java.io.*;
public class WordSearch{
  private char[][] grid;
  private ArrayList<String> wordsAdded;
  private Random rng;
  int seed;

  //assume a rectangular grid
  private void fillInRandomLetters(){
    for(int i = 0; i < grid.length; i++){
      for(int j = 0; i < grid[0].length; j++){
        if(grid[i][j] == '_'){
          grid[i][j] = (char)(rng.nextInt(26) + 'a');
  }

  private void addAllWords(String filename){
    ArrayList<String> wordsToAdd = loadWordsFromFile(filename);
    int wordnum = (int)(Math.random() * (wordsToAdd.size()-1));
    String newword = wordsToAdd.get(wordnum).toUpperCase;
    for(int i = 0; i < grid.length; i++){
      for(int j = 0; j < grid[0].length; j++){
        if(addWord(newword, i, j, 0, 1)){
          addWord(newword, i, j, 0, 1);
        } else if (addWord(newword, i, j, 1, 0)){
          addWord(newword, i, j, 1, 0);
        } else if(addWord(newword, i, j, 1, 1)){
          addWord(newword, i, j, 1, 1);
        } else if(addWord(newword, i, j, -1, 0)){
          addWord(newword, i, j, -1, 0);
        } else if(addWord(newword, i, j, 0, -1)){
          addWord(newword, i, j, 0, -1);
        } else if(addWord(newword, i, j, 1, -1)){
          addWord(newword, i, j, 1, -1);
        } else if(addWord(newword, i, j, -1, 1)){
          addWord(newword, i, j, -1, 1);
        } // rng.nextInt(3)-1
        //rng.nextInt()
      }
    }
  }

  public WordSearch(int rows,int cols, String fileName){
    rng = new Random();
    seed = rng.nextInt();
    rng = new Random(seed);
    grid = new char[rows][cols];
    clear();
    wordsAdded = new ArrayList<String>();
    addAllWords(fileName);
  }

  public WordSearch(int rows,int cols, String fileName, int seed){
    rng = new Random(seed);
    this.seed = seed;
    grid = new char[rows][cols];
    clear();
    wordsAdded = new ArrayList<String>();
    addAllWords(fileName);
  }

  public static ArrayList<String> loadWordsFromFile(String fileName){
    ArrayList<String>words = new ArrayList<String>();
    try{
      Scanner input = new Scanner(new File(fileName));
      while(input.hasNextLine()){
        String line = input.nextLine();
        if(! line.equals("")){
          words.add(line.toUpperCase());
        }
      }
    }catch(FileNotFoundException e){
      System.out.println(e);
      System.exit(1);
    }
    return words;
  }



  private void clear(){
    for(int r = 0; r < grid.length; r++){
      for(int c = 0; c < grid[r].length; c++){
        grid[r][c]='_';
      }
    }
  }


  //precondition word grids are rectangular
  private boolean inBounds(int r, int c){
    return r >= 0 && r < grid.length && c >= 0 && c < grid[0].length;
  }
  public boolean addWord(String word,int row, int col, int dr, int dc){
    //make sure there is some non 0 vector for direction
    if(dr == 0 && dc == 0){
      return false;
    }
    //check endpoints of word
    if(!inBounds(row,col) || !inBounds(row + dr * (word.length() - 1), col + dc * (word.length() - 1 ))){
      return false;
    }
    //check for conflicting letters
    for(int i = 0; i < word.length(); i++){
      char c = grid[row + i * dr][col + i * dc];
      if(c != '_' && c != word.charAt(i)){
        return false;
      }
    }
    //change
    for(int i = 0; i < word.length(); i++){
      grid[row + i * dr][col + i * dc] = word.charAt(i);
    }
    wordsAdded.add(word);
    return true;
  }

  public String toString(){
    String ans = "";
    for(int r = 0; r < grid.length; r++){
      for(int c = 0; c < grid[r].length; c++){
        ans += grid[r][c]+" ";
      }
      ans+="\n";
    }
    ans += "words: ";
    for(String word:wordsAdded){
      ans+= word+" ";
    }
    ans += "\nseed: "+seed;
    return ans;
  }
  public static void main(String[] args) {
    if(args.length == 5){
      WordSearch hello = new WordSearch(args[0], args[1], args[2], Integer.parseInt(args[4]));
      if(args[3] == 0){
        hello.fillInRandomLetters();
      }
      System.out.println(hello.toString());
    } else {
      WordSearch hii = new WordSearch(args[0], args[1], args[2]);
      if(args[3] == 0){
        hii.fillInRandomLetters();
      }
      System.out.println(hii.toString());
    }
  }
}
