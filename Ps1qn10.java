import java.util.*;

public class Ps1qn10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {{4,7,1,8},{3,8,9,5},{1,3,4,5},{8,1,5,6},{0,0,0,0}};
        for(int i=0;i<4;i++){
            int col_sum=0;
            
            for(int j=0;j<5;j++){
                if(j!=4){
                   col_sum += arr[j][i];
                }            
            }
            arr[4][i] = col_sum;
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<4;j++){
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
