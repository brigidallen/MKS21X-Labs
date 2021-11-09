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
  public void resize(){
    int bb = data.length;
    String[] data1;
    data1 = new String[(bb*2 + 1)];
    for (int i = 0; i < bb; i++){
      if(data[i] != null){
        data1[i] = data[i];
      } else{
        break;
      }
    }
  }

}
