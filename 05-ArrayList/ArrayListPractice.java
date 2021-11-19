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
    int j = 0;
    for(int i = 0; i < newone.size(); i+=2){
      newone.add(i, a.get(j));
      newone.add(i, b.get(j));
      j++;
    } return newone;
  }
}
