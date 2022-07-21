import java.util.*;
public class Ps1qn4 {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of gallons of gas in the tank :");
        float gal = sc.nextFloat();
        System.out.println("Enter the fuel efficiency in miles per gallon :");
        float eff = sc.nextFloat();
        System.out.println("Enter the price of gas per gallon :");
        float price = sc.nextFloat();
        
        System.out.println("Car can go (in miles) : " + gal*eff);
        System.out.println("Cost per 100 miles : " + 100*(1/eff)*price);
    }
}
