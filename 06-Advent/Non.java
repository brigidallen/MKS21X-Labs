import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Non{
  public static boolean firstcheck(String str){
    int counter = 0;
    for (int i = 0; i < str.length(); i++){
      if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
        counter++;
      }
    } if(counter >= 3){
      return true;
    } else {
      return false;
    }
  }
  public static boolean secondcheck(String str){
    for(int i = 0; i < str.length()-1; i++){
      if(str.charAt(i) == str.charAt(i+1)){
        return true;
      }
    } return false;
  }
  public static boolean thirdcheck(String str){
    if(str.contains("ab") || str.contains("cd") || str.contains("pq") || str.contains("xy")){
      return true;
    } return false;
  }
  public static int Final(String data){
    int counter =0;
    try{
      File file = new File(data);
      Scanner input = new Scanner(file);
      while(input.hasNextLine()){
        String c = input.nextLine();
        if (firstcheck(c) && secondcheck(c) & thirdcheck(c)){
          counter++;
        }
      } return counter;
    } catch(FileNotFoundException ex){
      //Hah
    } return 0;
  }
  public static void main(String[] args) {
    if(args[1].equals("1")){
      System.out.println(Final(args[0]) + "nice string");
    } else {
      System.out.println(Final(args[0]) + "triangles");
    }
  }

}
