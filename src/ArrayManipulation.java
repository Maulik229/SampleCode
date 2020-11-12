import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/*
5 3
1 2 100
2 5 100
3 4 100
* */
public class ArrayManipulation {
    public static void main(String[] args){

        int[][] arr = {{1,2,100},
                       {2,5,100},
                       {3,4,100}};
        long[] result = new long[7];
        long max = Integer.MIN_VALUE;
        long sum = 0;
        for( int i = 0; i < arr.length; i++ ){
            result[arr[i][0]] += arr[i][2];
            result[arr[i][1]+1] -= arr[i][2];
        }

        for (int i = 1; i < result.length; i++){
            result[i] = result[i-1] + result[i];
            sum = sum + result[i];
            max = Math.max(max,sum);
        }

        System.out.println(max);
        System.out.println(Arrays.toString(result));
    }

}
