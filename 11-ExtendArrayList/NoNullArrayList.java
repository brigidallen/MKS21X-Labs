import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList(){
    super();
  }
  public NoNullArrayList(int startingCapacity){
    super(startingCapacity);
  }
  @Override
  public T set(int index, T thing){
    if(thing == null){
      throw new IllegalArgumentException("Can't set to a null value");
    } else{
      return super.set(index, thing);
    }
  }
  @Override
  public boolean add(T thing){
    if(thing == null){
      throw new IllegalArgumentException("Can't add a null value");
    } else{
      return super.add(thing);
    }
  }
  public void add(int index, T thing){
    if(thing == null){
      throw new IllegalArgumentException("Can't add a null value");
    } else {
      super.add(index, thing);
    }
  }
  public static void main(String[] args) {
    NoNullArrayList gip = new NoNullArrayList(10);
    gip.add(0, "Haha");
    gip.add(1, "Vegetable");
    gip.add(2, null);
    gip.add(null);
    System.out.println(gip);
  }
}
