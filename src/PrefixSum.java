import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args){
        int[] arr = {12,34,56,22,27};

        int[] result = arr.clone();

        for(int i = 1; i < arr.length; i++){
            result[i] = arr[i]+ result[i-1];
        }

        System.out.println(Arrays.toString(result));
        System.out.print(Arrays.toString(arr));
    }
}
