package array_2d;

import java.util.HashSet;

public class Matrix_Zeros {
    public static void main(String[] args){
        int[][] grid = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        Matrix_Zeros a = new Matrix_Zeros();
        a.solve(grid);
    }

    private void solve(int[][] grid) {
        print(grid);
        HashSet<Integer> rowSet = new HashSet<>();
        HashSet<Integer> columnSet = new HashSet<>();

        for(int i=0; i < grid.length; i++){
            for(int j=0; j < grid[i].length; j++){
                if(grid[i][j] == 0){
                    rowSet.add(i);
                    columnSet.add(j);
                }
            }
        }

        for(int i=0; i < grid.length; i++){
            for(int j=0; j < grid[i].length; j++){
                if(rowSet.contains(i) || columnSet.contains(j)){
                    grid[i][j] = 0;
                }
            }
        }
        print(grid);
    }

    private void print(int[][] result){
        String target = "";
        for(int i=0; i < result.length; i++){
            target += "[";
            for(int j=0; j < result[i].length; j++){
                if(j < result[i].length -1) {
                    target += result[i][j] + ",";
                }else{
                    target += result[i][j];
                }
            }
            target += "] \n";
        }
        System.out.println(target);
    }

}
