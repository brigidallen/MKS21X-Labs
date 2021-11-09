public class Testing{
  public static void main(String[] args) {
    Superarray b = new Superarray();
    b.add("Hello");
    b.add("Hi");
    b.add("bye");
    Superarray c = new Superarray();
    c.add("efwef");
    c.add("wefwfwrgererferf");
    c.add("bbbb");
    c.add("sefw");
    c.add("rgerg");
    c.add("mango");
    c.add("apple");
    /* System.out.println(b);
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
    System.out.println(b.toStringDebug()); */
    // Phase 2 Testing
    //Loop that prints the individual elements of the Superarray
    for(int i = 0; i < b.size(); i++){
      System.out.println(b.get(i));
    }
    for(int i = 0; i < b.size(); i++){
      b.set(i, "bbbb");
    } System.out.println(b);
    System.out.println(b.indexOf("apple"));
    System.out.println(c.indexOf("apple"));
    System.out.println(c.lastIndexOf("bbbb"));
    System.out.println(c);
    c.add(4, "Hello.");
    System.out.println(c);
    c.remove(4);
    System.out.println(c);
    c.remove("Mango");
    System.out.println(c);
  }
}
