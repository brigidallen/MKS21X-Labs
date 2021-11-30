public class Non{
  public static boolean firstcheck(String str){
    int counter = 0;
    for (int i = 0; i < str.length(); i++){
      if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
        counter++;
      }
    } if(counter >= 3){
      return true;
    }
  }
}
