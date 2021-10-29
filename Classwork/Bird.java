public class Bird extends Animal{
  public double height;
  public String color;

  public Bird(String noise, int age, String name, double height, String color){
    this.height = height;
    this.color = color;
  }
  public void speak(){
    super.speak();
    System.out.println(" I am " + color);
    System.out.println("I am " + height + "inches tall");
  }
}
