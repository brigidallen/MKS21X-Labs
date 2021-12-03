import java.util.Arrays;
public class SelectionSort{
  public static void main(String[] args) {
    int[] Tester1 = {5,1,12, -5, 16, 2, 12, 14};
    System.out.println(Arrays.toString(Tester1));
    selectionSort(Tester1);
  }
  public static void selectionSort(int[]ary){
    for(int start=0; start < ary.length; start++){
      int c = start;
      for(int i = start; i < ary.length; i++){
        if(ary[i] < ary[c]){
          c = i;
        }
      } int temporary = ary[start];
      ary[start] = ary[c];
      ary[c] = temporary;
      System.out.println(Arrays.toString(ary));
    }
    System.out.println(Arrays.toString(ary));
  }
}
