public class SuperArray{
  private String[] data;
  private int size;
  public SuperArray(){
    data = new String[10];
    size = 0;
  }
  public SuperArray(int initialCapacity){
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
    if (index >= size() || index < 0){
      System.out.println(size());
      System.out.println(index);
      throw new IndexOutOfBoundsException(index + " out of bounds");
    }else {
      return data[index];
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
    if (size == data.length){
      String[] data1 = new String[size];
      for (int i = 0; i < data1.length; i++){
        data1[i] = data[i];
      }
      data = new String[size * 2 + 1];
      for (int i = 0; i < data1.length; i++){
        data[i] = data1[i];
      }
    }
  }
  public int indexOf(String target){
      for(int i = 0; i < size; i++){
        if(data[i] == target){
          return i;
        }
      } return -1;
    }
    public int lastIndexOf(String target){
      for(int i = size; i > 0; i --){
        if(data[i] == target){
          return i;
        }
      } return -1;
    }
    public void add(int index, String value){
      if (index < 0 || index >= size){
        return "Error";
      } size++;
      for(int i = size; i > index; i--){
        data[i] = data[i-1];
      } data[index] = value;
    }
    public String remove(int index){
      if (index < 0 || index >= size){
        return "Error, index out of range";
      }
      size--;
      String a = data[index];
      for(int i = index; i < size; i++){
        data[i] = data[i+1];
      } return a;
    }
    public boolean remove(String target){
      if(indexOf(target) != -1){
        size--;
        for (int i = indexOf(target); i < size; i++){
          data[i] = data[i+1];
        }
      }
        return false;
    }
}
