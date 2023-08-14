import java.util.ArrayList;
import java.util.List;
public class Veggie{
public static void main(String args[]){
	List<String> sublist = new ArrayList<String>();
	sublist.add("carrot");
	sublist.add("lady finger");
	sublist.add("potato");
	sublist.add("brinjal");
	System.out.println("VEGETABLE LIST");
	sublist.forEach(sub -> System.out.println(sub));
	}
}