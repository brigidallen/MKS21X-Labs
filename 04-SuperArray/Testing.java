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
    System.out.println(b.get(3));
    System.out.println(b.get(4));
    System.out.println(b.set(2, "bdjdsjdsjdsj"));
    System.out.println(b.set(4, "Lololol"));
    System.out.println(b);
    System.out.println(b.get(-1));
    System.out.println(b.set(6, "ababab"));
    System.out.println(b);
    Superarray a = new Superarray(20);
    System.out.println(a.toStringDebug());
    b.resize();
    System.out.println(b.toStringDebug());
    // Phase 2 Testing
    //Loop that prints the individual elements of the Superarray
    for(int i = 0; i < b.size(); i++){
      System.out.println(b.get(i));
    }
    for(int i = 0; i < b.size(); i++){
      b.set(i, "bbbb");
    } System.out.println(b);
  }
}
