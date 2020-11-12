import java.util.*;

public class Sample {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"ab");
        map.put(2,"bc");
        map.put(3,"cd");
        map.put(4,"de");
        map.put(5,"ef");
        map.put(6,"bc");
        map.put(7,"de");
        map.put(8,"ab");

        list.add("ab");
        list.add("bc");
        list.add("cd");
        list.add("de");
        list.add("ef");
        list.add("bc");
        list.add("de");
        list.add("ab");

        System.out.println(list);
        Set<String> set = new HashSet<>(list);
        TreeSet<String> tree = new TreeSet<String>(set);


        System.out.println(set);
        System.out.println(tree);


    }
}
