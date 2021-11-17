import java.util.ArrayList;
public class ArrayListPractice{
  public static ArrayList<String> replaceEmpty(ArrayList<String> data){
    for (int i = 0; i < data.size(); i++){
      if (data.get(i).equals("")){
        data.set(i, "Empty");
      }
    } return data;
  }
  public static ArrayList<String> makeReversedList(ArrayList<String> data){
    for (int i = 0; i < data.size(); i++){

    }
  }
  public static ArrayList<String> mixLists (ArrayList<String> a, ArrayList<String> b){
    ArrayList<String> newone = new ArrayList<String>(a.size() + b.size());
        newone.set(i, a.get(i));
      }
      for (int i = 1; i < (a.size() + b.size()); i+= 2){
        newone.set(i, b.get(i));
      }
  }
}
