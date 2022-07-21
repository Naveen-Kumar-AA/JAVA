import java.util.*;
public class PS1_2 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a letter grade : ");
        String grd = s.nextLine();
        System.out.print(grd);
        switch(grd){
           case "A+": 
              float x = 4;
              System.out.println("The numeric value is " + x);
              break;
           case "A-":
               x = (float) 3.7;
               System.out.println("The numeric value is " + x);
               break;
           case "B+":
                  x = (float) (3+0.3);
                  System.out.println("The numeric value is " + x);
                  break;
                
            case "B-":
                
                  x = (float) (3-0.3);
                  System.out.println("The numeric value is " + x);
                  break;
                
            case "C+":
               
                    x = (float) (2+0.3);
                    System.out.println("The numeric value is " + x);
                    break;
                
            case "C-":
                
                    x = (float) (2-0.3);
                    System.out.println("The numeric value is " + x);
                    break;
                
            case "D+":
                
                    x = (float) (1+0.3);
                    System.out.println("The numeric value is " + x);
                    break;
                
            case "D-":
               
                    x = (float) (1-0.3);
                    System.out.println("The numeric value is " + x);
                    break;
                
            case "F":
                 System.out.println("The numeric value is 0");
                 break;
        }
    }
}
