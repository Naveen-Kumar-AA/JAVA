import java.lang.Math;

public class Account{
    long accNo;
    String name;
    double bal;
    Account(double balance, String owner, long num){
        accNo = num;
        bal = balance;
        name = owner;
    }
    Account(double balance, String owner){
        bal = balance;
        name = owner;
        accNo = (long) (Math.random() * 1000000000) + 1000000000;
    }
    Account(String owner){
        name = owner;
        bal = 0;
        accNo = (long) (Math.random() * 1000000000) + 1000000000;
    }

    public double getBal(){
        return bal;
    }

    public long getAccNo() {
        return accNo;
    }

    public String getName() {
        return name;
    }

    public double withdraw(double amt){
        if(bal >= amt) {
            bal -= amt;
            return bal;
        }
        else{
            return -1;
        }
    }

    public double deposit(double amt){
        bal += amt;
        return bal;
    }

    public String getAccDetails(){
        return "Name : " + name + "\nBalance : " + bal + "\nAccount number : " + accNo;
    }


}
