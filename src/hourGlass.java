//1 1 1 0 0 0
//0 1 0 0 0 0
//1 1 1 0 0 0
//0 0 2 4 4 0
//0 0 0 2 0 0
//0 0 1 2 4 0
public class hourGlass {
    public static void main(String[] args) {
        int[] load = new int[]{1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 2, 4, 4, 0, 0, 0, 0, 2, 0, 0, 0, 0, 1, 2, 4, 0};
        //int[] load = new int[]{-1,-1,0,-9,-2,-2,-2,-1,-6,-8,-2,-5,-1,-1,-1,-2,-3,-4,-1,-9,-2,-4,-4,-5,-7,-3,-3,-2,-9,-9,-1,-3,-1,-2,-4,-5};
        int[][] arr = new int[6][6];
        int loadIndex = 0;
        int hg = 3 , hgY = 0, hgX = 0;
        int hgSize = 3;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = load[loadIndex++];
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out. print(arr[i][j] + " ");
            }
                System.out.println();
        }
            for(int i = 0; i<4; i++) {
                for (int j = 0; j<4; j++){
                    sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] +
                                    arr[i+1][j+1] +
                            arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                    maxSum = Math.max(maxSum,sum);
                }


            }

        System.out.println(maxSum);

    }
}
