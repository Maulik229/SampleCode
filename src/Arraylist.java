import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        List<List<Integer>> aList = new ArrayList<>();

        List<Integer> list1 = Arrays.asList(2,3,4);
        List<Integer> list2 = Arrays.asList(4,7,9);
        List<Integer> list3 = Arrays.asList(1,5,8);
        List<Integer> list4 = Arrays.asList(3,4,6);
        List<Integer> list5 = Arrays.asList(2,4,9);

        aList.add(list1);
        aList.add(list2);
        aList.add(list3);
        aList.add(list4);
        aList.add(list5);

        System.out.println(aList);
        System.out.println(aList.get(3).get(2));


    }
}
