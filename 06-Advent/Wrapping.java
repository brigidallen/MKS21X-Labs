import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Wrapping{
  public static void main(String[] args){
    try {
        int wraptotal = 0;
        int ribbtotal = 0;
        File file = new File(args[0]);
              Scanner input = new Scanner(file);
              while(input.hasNextLine()){
                String line = input.nextLine();
                String[] splitz = line.split("x");
                wraptotal += Giftwrapper(splitz[0], splitz[1], splitz[2]);
                ribbtotal += ribbon(splitz[0], splitz[1], splitz[2]);
              }
                if(Integer.parseInt(args[1]) == 1){
                //System.out.println(Giftwrapper(splitz[0], splitz[1], splitz[2]));
                System.out.println(wraptotal);
                }
              else {
                //System.out.println(ribbon(splitz[0], splitz[1], splitz[2]));
                System.out.println(ribbtotal);
                }
            }
            catch(FileNotFoundException e){
          System.out.println("Filenotfound exception");

  	}
  }

  public static int Giftwrapper(String l1, String w1, String h1){
    int length = Integer.parseInt(l1);
    int width = Integer.parseInt(w1);
    int height = Integer.parseInt(h1);
    int total = 0;
    total += 2*length*width;
    total += 2*length*height;
    total += 2*width*height;
    if(length*width < width*height && length*width < length*height){
      total += length*width;
    } else if (width*height < length*height){
      total += width*height;
    } else {
      total += length*height;
    }
    return total;
  }

  public static int ribbon(String l1, String w1, String h1){
    int length = Integer.parseInt(l1);
    int width = Integer.parseInt(w1);
    int height = Integer.parseInt(h1);
    int ribb = 0;
    ribb+= length + length + width + width + length * width * height;
    return ribb;
  }
}
