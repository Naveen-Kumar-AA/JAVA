import java.util.*;

public class Ps1qn6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int x = sc.nextInt();
        System.out.print("Char equivalent of " + x + " : " + (char)x);
        float y = (float)((x/3)/3)/3;
        y = (float) (y * 27);
        System.out.println("y : " + y);
    }
}
