import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

	public static void main(String[] args){
	int counterrrr = 0;
	 try {
	 	File file = new File("data");
	 	Scanner input = new Scanner(file);
	 	while(input.hasNextInt()){
	 	int a1 = input.nextInt();
	 	int a2 = input.nextInt();
	 	int a3 = input.nextInt();
	 	int b1 = input.nextInt();
	 	int b2 = input.nextInt();
	 	int b3 = input.nextInt();
	 	int c1 = input.nextInt();
	 	int c2 = input.nextInt();
	 	int c3 = input.nextInt();
	 	if((a1 + b1) > c1 && (b1 + c1) > a1 && (a1+c1) > b1){
                     counterrrr++;
                     }
                if((a2 + b2) > c2 && (b2 + c2) > a2 && (a2+c2) > b2{
                     counterrrr++;
                     }
                if((a3+ b) >  (b1 + c1) > a1 && (a1+c1) > b1){
                     counterrrr++;
                     }
	 	} System.out.println(counterrrr);
	} catch(FileNotFoundException ex){
		//File not found
	}
}
