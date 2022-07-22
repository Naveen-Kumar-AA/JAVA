import java.util.*;

class Ps2qn3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the efficiency of your car (km/l) : ");
        float effi = sc.nextFloat();
        Car mycar = new Car(effi);
        System.out.print("Enter initial fuel :");
        float iniFuel = sc.nextFloat();
        mycar.fillTank(iniFuel);
        System.out.print("Enter the distance you want to drive : ");
        int dist = sc.nextInt();
        mycar.drive(dist);
        System.out.println("Fuel after driving " + dist + "km : " + mycar.getCurrFuel());
    }
}