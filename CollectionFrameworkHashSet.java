import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionFrameworkHashSet {

    public static void main(String[] args) {
        List<String> palabrasArrayList = new ArrayList<>();
        palabrasArrayList.add("Marcos");
        palabrasArrayList.add("Mariano");
        palabrasArrayList.add("Pedro");
        palabrasArrayList.add("Pablo");

        palabrasArrayList.remove("Marcos");
        palabrasArrayList.remove(3);

        Set<String> hashSet = new HashSet<>();

        hashSet.addAll(palabrasArrayList);

        hashSet.remove("Pedro");

        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("Za", "Marcoantonio");
        hashMap.put("Za", "Pepito");
        hashMap.put("Ze", "Elias");

        hashMap.remove("Ze");

        System.out.println();

    }
}