import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList(){
    super();
  }
  public NoNullArrayList(int startingCapacity){
    super(startingCapacity);
  }
  public T set(int index, T thing){
    if(thing == null){
      throw new IllegalArgumentException("Can't set to a null value");
    } else{
      return super.set(index, thing);
    }
  }
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
}
