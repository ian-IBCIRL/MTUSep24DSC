import java.util.ArrayList;
import java.util.List;

public class ArrayListDriver {
    public static void main(String[] args) {
        List<String> names = new ArrayList();
        names.add("Bill"); // adds at end
        names.add("Jill");
        names.add("Paul");
        names.add("Sue"); // names now has Bill, Jill, Tim, Sue
        names.add(1,"Rob"); //names now has Bill, Rob, Jill, Tim, Sue
        //this requires elements after Bill to be shifted

        //output the contents of the list
        for (int i = 0; i < names.size(); i++){
            String name = names.get(i);
            System.out.println(name);
        }
    }
}
