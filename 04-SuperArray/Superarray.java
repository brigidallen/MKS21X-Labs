public class Superarray{
  private String[] data;
  private int size;
  public Superarray(){
    data = new String[10];
    size = 0;
  }
  public Superarray(int initialCapacity){
    data = new String[initialCapacity];
    size = 0;
  }
  public int size(){
    return size;
  }
  public boolean add(String s){
    if (size < data.length){
      data[size] = s;
      size ++;
      return true;
    } return false;
  }
  public String toString(){
    String str = "";
    str += "[";
    for (int i = 0; i < size; i++){
      str += data[i];
      if (i < size-1){
        str += ", ";
      }
    } str += "]";
    return str;
  }
  public String toStringDebug(){
    String str = "";
    str += "[";
    for (int i = 0; i < data.length; i++){
      str += data[i];
      if (i < data.length-1){
        str += ", ";
      }
    } str += "]";
    return str;
  }
  public String get(int index){
    if (index > size || index < 0){
      return "Error index out of range";
    }
    else if (data[index] != null){
      return data[index];
    } else {
      return "Error. Null value";
    }
  }
  public String set(int index, String element){
    if (index > size || index < 0){
      return "Error index out of range";
    }
    else if (data[index] != null){
      String ss = data[index];
      data[index] = element;
      return ss;
    } else {
      return "Error. Null value";
    }
  }
  private void resize(){
    int bb = data.length;
    data1 = new String[bb*2 + 1];
    for (int i = 0; i < bb; i++){
      data
    }
  }
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
  }
}
