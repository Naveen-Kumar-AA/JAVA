public class Car {
    float eff;
    float currFuel;

    Car(float eff){
        this.eff = eff;
        currFuel = 0;
    }
    public float getCurrFuel(){
        return currFuel;
    }
    public void fillTank(float fuel){
        currFuel += fuel;
    }
    public void drive(int km){
        currFuel -= km/eff;
    }
}
