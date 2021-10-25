public class Kitty{
  private int age;
  private String name;
  public Kitty (){
    age = 2;
    name = "Mittens";
  }
  public Kitty(int firstAge, String firstName){
    age = firstAge;
    name = firstName;
  }
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  public void changeName(String str){
    name = str;
  }
  public void makeOlder(){
    age++;
  }
  public String toString() {
    return "The amazing " + name; 
  }
}
