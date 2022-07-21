import java.lang.Math;
import java.util.*;

public class Ps1qn11 {
    private static boolean checkPrime(int x){
        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A : ");
        int a = sc.nextInt();
        System.out.println("Enter B :");
        int b = sc.nextInt();
        if(a<2 || b<a){
            System.out.println("Invalid input!");
            return;
        }
        for(int i=a; i<=b; i++){
            if(checkPrime(i)){
                System.out.println(i);
            }
        }
    }
}
