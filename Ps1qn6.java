import java.util.*;
import java.text.DecimalFormat;

public class Ps2qn1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int x;
        try{
            x = sc.nextInt();
        }
        catch(Exception e){
            System.out.println("Enter a number, not a char or symbol!!!");
            return;
        }
        System.out.print("Char equivalent of " + x + " : " + (char)x);
        System.out.println();
        float y;
//        System.out.println("y/3 : " + (float)y/3);
//        System.out.println("y/3/3 : " + (float)y/3/3);
//        System.out.println("y/3/3/3 : " + (float)y/3/3/3);
//        System.out.println("y/3/3/3*27 : " + (float)y/3/3/3*27);
        y = (float)x/3/3/3;
        y = (float)y * 27;
        DecimalFormat df_obj = new DecimalFormat("#.##");
        System.out.println("y : " + df_obj.format(y));
        if(y == x){
            System.out.println("It is same as the original number : "+df_obj.format(y));
        }
        if(y <= x+0.001 || y >= x-0.001){
            System.out.println("The number lies between +/- 0.001 : "+df_obj.format(y));
        }


    }
}
