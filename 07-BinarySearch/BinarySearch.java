public class BinarySearch{
  public static int binarySearch(int[]data, int target){
    int start = 0;
    int end = data.length -1;
    int mid = start + end / 2;
    while (start < end){
      if (target == data[mid]){
        return mid;
      } else if (target > data[mid]){
        start = mid+1;
      } else {
        end = mid-1;
      }
    } return -1;
  }
}
