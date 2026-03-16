package Day11;

class Account{
    double balance;

    Account(double balance){
        this.balance = balance;
    }

    double calculateInterest(){
        return balance * (2.0 / 100);
    }
}

class SavingAccount extends Account{
    SavingAccount(double balance){
        super(balance);
    }

    @Override
    double calculateInterest() {
        double interest = balance * (4.0 / 100);

        if(balance > 50000){
            interest += 500;
        }

        return interest;
    }
}

class FixedDeposite extends SavingAccount{
    FixedDeposite(double balance){
        super(balance);
    }

    @Override
    double calculateInterest(){
        double newInterest = super.calculateInterest();
        return newInterest + balance * (2.0 / 100);
    }
}

public class Q1 {
    public static void main(String[] arg){
        Account acc1 = new SavingAccount(10000);
        Account acc2 = new SavingAccount(60000);
        Account acc3 = new FixedDeposite(60000);

        double result1 = acc1.calculateInterest();
        double result2 = acc2.calculateInterest();
        double result3 = acc3.calculateInterest();
        
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}