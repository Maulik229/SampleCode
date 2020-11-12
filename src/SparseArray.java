import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SparseArray {
    public static void main(String[] args) {
        String[] strings = {"abcde", "sdaklfj", "asdjf", "na", "basdn", "sdaklfj", "asdjf", "na", "asdjf", "na", "basdn", "sdaklfj", "asdjf" };
        String[] queries = {"abcde", "sdaklfj", "asdjf", "na", "basdn"};

        System.out.println(Arrays.toString(strings));

        Map<String,Integer> map = new HashMap<String, Integer>();
        int count = 1;
        for (String i : strings){

            if (map.containsKey(i)){
                map.put(i,map.get(i)+1);
            } else {
                map.put(i, 1);
            }

        }
        int[] output = new int[queries.length];
        for (int i = 0; i < queries.length; i++){
            if(map.containsKey(queries[i])){
                output[i] = map.get(queries[i]);
            } else {
                output[i] = 0;
            }
        }
        System.out.println(map.entrySet());
        System.out.print(Arrays.toString(output));
    }
}
