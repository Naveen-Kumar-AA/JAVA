import java.util.*;

class Account{
    double balance;
    Account(double bal){
        this.balance = bal;
    }
    public void deposit(double amt){
        balance += amt;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amt){
        balance -= amt;
    }
}

class SavingAcc extends Account{
    static double defaultInterestRate = 2.5;
    double intRate;
    SavingAcc(double bal, double rate){
        super(bal);
        intRate = rate;
    }
    SavingAcc(double bal){
        super(bal);
        intRate = defaultInterestRate;
    }
    static void setDefaultInterestRate(double rate){
        defaultInterestRate = rate;
    }
    void applyMonthlyInterest(){
        balance = balance * (1+(intRate/100)*0.083333);
    }
}

class BankAccount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account1 = new Account(10000);
        System.out.println("New account balance : " + account1.getBalance());
        account1.deposit(15000);
        account1.withdraw(5000);
        System.out.println("Deposited 15000 and withdrawed 5000.\nNew balance : "+account1.getBalance());
        SavingAcc savingAcc1 = new SavingAcc(15000);
        System.out.println("New savings account balance : "+ savingAcc1.getBalance());
        savingAcc1.applyMonthlyInterest();
        System.out.println("After one month of interest, new balance is : " + savingAcc1.getBalance());
        System.out.println("Setting default interest rate to 3.5...");
        SavingAcc.setDefaultInterestRate(3.5);
        
    }
}