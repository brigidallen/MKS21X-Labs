  import java.io.File;
  import java.io.FileNotFoundException;
  import java.util.Scanner;
  public class ReadFile {
     public static void main(String[] args) {
       int Linenum = 0;
       int counterrrr = 0;
       boolean Ok = true;
         try {
             File file = new File("data");
             Scanner input = new Scanner(file);
                 while(input.hasNextInt()){
                 int a = input.nextInt();
                 int b = input.nextInt();
                 int c = input.nextInt();
                   if((a + b) > c && (b + c) > a && (a+c) > b){
                     counterrrr++;
                     Ok = true;
                   } else {
                   Ok = false;
                   }
                 System.out.println("Line "+Linenum+": "+a+" "+b+" "+c+" "+Ok);
                 Linenum++;
             }
             input.close();
             System.out.println("There were " + Linenum + " lines, and " + counterrrr + " traingles. Spelling is hard");
         } catch (FileNotFoundException ex) {
             //File not found
         }
     }
 }
