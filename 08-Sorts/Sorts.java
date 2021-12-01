import java.util.Arrays;
public class Sorts{
  public static void main(String[] args) {
    int[]Onedata = {2, 3, 1, 6, 0, 9, 4};
    int[]Twodata = {0, 1, 3, 2, 6, 4, 7, 20, 3};
    bubbleSort(Onedata);
    System.out.println(Arrays.toString(Onedata));
  }
  public static void bubbleSort(int[] data){
    int theend = data.length-1;
    for(int j = 0; j < theend; j--){
      for(int i = 0; i < data.length-1; i++){
        if(data[i] > data[i+1]){
          int temp = data[i];
          data[i] = data[i+1];
          data[i+1] = temp;
        }
      }
    }
  }
}
