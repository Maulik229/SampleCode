import java.util.*;
import java.util.stream.Collectors;

public class SockPairs {
    public static void main(String[] args){
        int[] socks = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        Set<Integer> set = new HashSet<>();
        int count = 0;
       for(int i = 0; i< socks.length; i++ ){
           if (!set.add(socks[i])) {
               set.remove(socks[i]);
               count++;
           }

       }
        System.out.println(count);
    }
}
