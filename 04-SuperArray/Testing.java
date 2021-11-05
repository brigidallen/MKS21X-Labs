public class Testing{
  public static void main(String[] args) {
    Superarray b = new Superarray();
    b.add("Hello");
    b.add("Hi");
    b.add("bye");
    System.out.println(b);
    System.out.println(b.size());
    System.out.println(b.toStringDebug());
    System.out.println(b.add("Hihihihi"));
    System.out.println(b);
  }
}
