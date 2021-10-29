public class Animal {
  private String noise;
  private int age;
  private String name;

  public Animal(String noise, int age, String name){
    //initialize the values (hint use this.varname to clarify)
    this.noise = noise;
    this.age = age;
    this.name = name;
  }

  public String getName() {
    //accessor
    return name;
  }
  public void speak(){
    System.out.println("My name is " + getName());
    System.out.println("I am " + age + "years old");
    System.out.println("I say " + noise);
  }
}
