import java.util.Arrays;
public class Sorts{
  public static void main(String[] args) {
    int[]Onedata = {2, 3, 1, 6, 0, 9, 4};
    int[]Twodata = {0, 1, 3, 2, 6, 4, 7, 20, 3};
    System.out.println(Arrays.toString(Onedata));
    insertionSort(Onedata);
    System.out.println(Arrays.toString(Onedata));
    int[]Randeqdata = new int[10];
    for(int i = 0; i < Randeqdata.length; i++){
      Randeqdata[i] = (int)(Math.random()*10);
    }
    System.out.println("Randomized data: " + Arrays.toString(Randeqdata));
    insertionSort(Randeqdata);
    System.out.println("Randomized sorted: " + Arrays.toString(Randeqdata));
    int[]Rand2 = new int[10];
    for (int i = 0; i < Rand2.length; i++){
      Rand2[i] = (int)(Math.random()*10);
    }
    Arrays.sort(Rand2);
    System.out.println("Array sort: " + Arrays.toString(Rand2));
    insertionSort(Rand2);
    System.out.println("insertionSort: " + Arrays.toString(Rand2));
    int[]Rand2copy = new int[Rand2.length];
    for(int i = 0; i < Rand2.length; i++){
      Rand2copy[i] = Rand2[Rand2.length-(i+1)];
    }
    System.out.println(Arrays.toString(Rand2copy));
    insertionSort(Rand2copy);
    System.out.println(Arrays.toString(Rand2copy));
  }
  public static void bubbleSort(int[] data){
    int theend = data.length-1;
    for(int j = theend; j > 0; j--){
      for(int i = 0; i < data.length-1; i++){
        if(data[i] > data[i+1]){
          int temp = data[i];
          data[i] = data[i+1];
          data[i+1] = temp;
        }
      }
    }
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
    }
    //System.out.println(Arrays.toString(ary));
  }
  public static void insertionSort(int[]ary){
    for(int i = 1; i < ary.length; i++){
      int j = i-1;
      while(ary[i] < ary[j] && j !=0){
        j--;
      } int subst = ary[i];
      for(int k = i; k > j; k--){
        ary[k] = ary[k-1];
      } ary[j] = subst;
    }
  }
}
