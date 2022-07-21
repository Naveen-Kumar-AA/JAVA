import java.util.*; 
public class Ps1qn1 {
    public static void main(String args[]) {
    
        Scanner sc= new Scanner(System.in);
        System.out.println("Convert from...?");
        String from= sc.nextLine();
        System.out.println("Convert to...?");
        String to= sc.nextLine();

        
        switch(from){
            case "floz":
                if("ml".equals(to)){
                    System.out.println("Enter the value :");
                    float val = sc.nextFloat();
                    float x;
                    x = (float) (val * 29.586);
                    System.out.println(val+from+" = "+x+to);
                }
                else{
                    System.out.println("Enter a valid conversion!");
                }
                break;
            case "gal":
                if("l".equals(to)){
                    System.out.println("Enter the value :");
                    float val = sc.nextFloat();
                    float x;
                    x = (float) (val * 3.785);
                    System.out.println(val+from+" = "+x+to);
                    
                }
                else{
                    System.out.println("Enter a valid conversion!");
                }
                break;
            case "oz":
                if("g".equals(to)){
                    System.out.println("Enter the value :");
                    float val = sc.nextFloat();
                    float x;
                    x = (float) (val * 28.3495);
                    System.out.println(val+from+" = "+x+to);
                    
                }
                else{
                    System.out.println("Enter a valid conversion!");
                }
                break;
            case "lb":
                if("g".equals(to)){
                    System.out.println("Enter the value :");
                    float val = sc.nextFloat();
                    float x;
                    x = (float) (val * 453.6);
                    System.out.println(val+from+" = "+x+to);
                    
                }
                else{
                    System.out.println("Enter a valid conversion!");
                }
                break;
            case "in":
                if("cm".equals(to)){
                    System.out.println("Enter the value :");
                    float val = sc.nextFloat();
                    float x;
                    x = (float) (val * 28.3495);
                    System.out.println(val+from+" = "+x+to);
                    
                }
                else{
                    System.out.println("Enter a valid conversion!");
                }
                break;
            case "ft":
                if("cm".equals(to)){
                    System.out.println("Enter the value :");
                    float val = sc.nextFloat();
                    float x;
                    x = (float) (val * 30.5);
                    System.out.println(val+from+" = "+x+to);
                    
                }
                else{
                    System.out.println("Enter a valid conversion!");
                }
                break;
            case "mi":
                if("km".equals(to)){
                    System.out.println("Enter the value :");
                    float val = sc.nextFloat();
                    float x;
                    x = (float) (val * 1.609);
                    System.out.println(val+from+" = "+x+to);
                    
                }
                else{
                    System.out.println("Enter a valid conversion!");
                }
                break;
            default:
                System.out.println("Enter a valid conversion!");
            }


    }
}
