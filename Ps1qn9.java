import java.lang.Math;
import java.util.*;

public class Ps1qn9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][2];
        for(int i=0; i<5; i++) {
            System.out.println("Enter A :");
            arr[i][0] = sc.nextInt();
            System.out.println("Enter B :");
            arr[i][1] = sc.nextInt();
            
        }
        
        for(int i=0;i<5;i++){
            System.out.println("A : " + arr[i][0] + " B : " + arr[i][1] + " POW(A,B) : " + Math.pow(arr[i][0], arr[i][1]));
        }
    }
        
}
