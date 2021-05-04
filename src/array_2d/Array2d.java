package array_2d;

public class Array2d {
    public static void main(String[] args){
        // 1. 2차원배열의 크기가 같다
        int[][] grid1 = new int[3][4];
        grid1[0][1] = 1;

        // 2. 2차원배열의 크기가 다르다
        /**
         * grid2 배열형태
         * 0: 00
         * 1: 0000
         * 2: 0000000
         */
        int[][] grid2 = new int[3][];
        grid2[0] = new int[2];
        grid2[1] = new int[4];
        grid2[2] = new int[7];

        grid2[0][1] = 1;

        System.out.println(grid1[0][1]);
        System.out.println(grid2[0][1]);
    }
}
