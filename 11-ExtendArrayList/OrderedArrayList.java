import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }
  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }
  @Override
  public boolean add(T element){
    return super.add(whereToPlace(element), element);
  }
  @Override
  public void add(int index, T element){
    super.add(whereToPlace(element), element);
  }
  private int whereToPlace(T value){
    if(size() > 0){
      for(int i = 0; i < size(); i++){
        if(value.compareTo(get(i)) < 0){
          return i;
        }
      }
    } return 0;
  }
  @Override
  public T set(int index, T element){
    remove(index);
    return super.add(whereToPlace(element), element);
  }
  public static void main(String[] args) {
    OrderedArrayList<String> newbie = new OrderedArrayList<String>(10);
    newbie.add("Moo");
    newbie.add("Hello");
    newbie.add("Okay");
    newbie.add("Toomuch");
    newbie.add(2, "Bro");
    System.out.println(newbie);
  }
}
