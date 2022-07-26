import java.util.*;

class Ps2qn4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account LoguN = new Account("LoguN");
        LoguN.deposit(20000);
        String LogunzDetails = LoguN.getAccDetails();
        System.out.println(LogunzDetails);
        int currNoAcc;
        currNoAcc = Account.getNumAcc();
        System.out.println("Current no of accounts in the bank after creating account for LoguN : " + currNoAcc);
        Account Grim = new Account(15000,"GR1M");
        String GrimDetails = Grim.getAccDetails();
        System.out.println(GrimDetails);
        currNoAcc = Account.getNumAcc();
        System.out.println("Current no of accounts in the bank after creating account for GR1M : " + currNoAcc);
        Account Body = new Account(1500000,"BODY-SODA");
        String BodySodaDetails = Body.getAccDetails();
        System.out.println(BodySodaDetails);
        currNoAcc = Account.getNumAcc();
        System.out.println("Current no of accounts in the bank after creating account for Body-Soda : " + currNoAcc);
        System.out.println("Closing Grim's account...");
        Grim.close();
        System.out.println("Current no of accounts in the bank after closing GR1M : " + Account.getNumAcc());
        System.out.println("Total amt deposited : " + Account.getAmtDeposit());
        System.out.println("Total amt withdrawed : "+Account.getAmtWithdraw());
        System.out.println("Total no of withdrawals :" + Account.getNumWithdraw());
        System.out.println("Total no of deposits : "+ Account.getNumDeposit());
        System.out.println("Total amt deposited :" + Account.getAmtDeposit());
    }
}