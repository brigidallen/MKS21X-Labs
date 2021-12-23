public class Parsing{
    public static int stringToInt(String s){
      int lolo = 0;
      for(int i = 0; i < s.length(); i++){
        char c = s.charAt(i);
        lolo += valueOfDigit(c)*(10^(s.length()-1-i));
      } return lolo;
    }
    public static int valueOfDigit(char c){
      int b = (int) c;
      return b;
    }
    public static void main(String[] args) {
      String s = "12345";
      String n = "235235";
      System.out.println(stringToInt(s));
      System.out.println(stringToInt(n));
    }
}
