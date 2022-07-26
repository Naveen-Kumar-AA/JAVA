import java.lang.Math;

public class Account{
    long accNo;
    String name;
    double bal;
    private static int numAcc = 0;
    private static int numWithdraw = 0;
    private static int numDeposit = 0;
    private static double amtWithdraw = 0;
    private static double amtDeposit = 0;

    Account(double balance, String owner, long num){
        accNo = num;
        bal = balance;
        name = owner;
        numAcc += 1;
    }
    Account(double balance, String owner){
        bal = balance;
        name = owner;
        accNo = (long) (Math.random() * 1000000000) + 1000000000;
        numAcc += 1;
    }
    Account(String owner){
        name = owner;
        bal = 0;
        accNo = (long) (Math.random() * 1000000000) + 1000000000;
        numAcc += 1;
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
            numWithdraw += 1;
            amtWithdraw += amt;
            return bal;
        }
        else{
            return -1;
        }
    }

    public double deposit(double amt){
        bal += amt;
        numDeposit += 1;
        amtDeposit += amt;
        return bal;
    }

    public String getAccDetails(){
        return "Name : " + name + "\nBalance : " + bal + "\nAccount number : " + accNo;
    }

    public static int getNumAcc(){
        return numAcc;
    }

    public void close(){
        name += "CLOSED";
        bal = 0;
        numAcc -= 1;
    }

    public static int getNumWithdraw(){
        return numWithdraw;
    }

    public static int getNumDeposit(){
        return numDeposit;
    }

    public static double getAmtDeposit() {
        return amtDeposit;
    }

    public static double getAmtWithdraw() {
        return amtWithdraw;
    }

}

