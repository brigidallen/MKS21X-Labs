public class OrderedArrayList<T> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }
  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }
  @Override
  public boolean add(int index, T element){
    super.add(whereToPlace(element), element);
  }
  private int whereToPlace(T value){
    for(int i = 0; i < size(); i++){
      if(value.compareTo(get(i)) < 0){
        return i;
      }
    }
  }
}
