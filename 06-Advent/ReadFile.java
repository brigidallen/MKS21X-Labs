  import java.io.File;
  import java.io.FileNotFoundException;
  import java.util.Scanner;
  public class ReadFile {
     public static void main(String[] args) {
       int Linenum = 0;
       int counterrrr = 0;
         try {
             File file = new File("data");
             Scanner input = new Scanner(file);
                 while(input.hasNextInt()){
                   if((input.nextInt() + input.nextInt()) < input.nextInt()){
                     counterrrr++;
                   }
                 //System.out.println("Line "+Linenum+": "+input.nextInt()+" "+input.nextInt()+" "+input.nextInt()+" "+Ok);
                 Linenum++;
             }
             input.close();
             System.out.println("There were " + Linenum + " lines, and " + counterrrr + " traingles. Spelling is hard");
         } catch (FileNotFoundException ex) {
             //File not found
         }
     }
 }
