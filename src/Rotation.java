import java.util.ArrayList;
import java.util.List;

public class Rotation {
    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        for(int i = 0; i<4; i++){
            int temp = arr.get(0);
            arr.remove(0);
            arr.add(temp);
        }
        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}
