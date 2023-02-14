import java.util.*;
// Main method implementions BankTransfer Interface
public class Main implements BankTransfer{
    public static ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();

    public void Transaction(int sender, int reciever, int amount){
        BankAccount obj1 = null;
        BankAccount obj2 = null;

        for(BankAccount account : accounts){
            if(account.getAccountNumber() == sender){
                obj1 = account;
            }

            if(account.getAccountNumber() == reciever){
                obj2 = account;
            }
        }

        if(obj1.reduceMoney(amount)){
            obj2.addMoney(amount);

            System.out.println("Transaction Complete!");
        }
        else{
            System.out.println("Transaction Failed!");
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();

        Savings ac1 = new Savings("Akash", 19, 123456, 50000);
        accounts.add(ac1);

        Savings ac2 = new Savings("Ragul", 20, 567890, 75000);
        accounts.add(ac2);

        ac1.displayDetails();
        ac2.displayDetails();

        obj.Transaction(123456, 567890, 51000);

        ac1.displayDetails();
        ac2.displayDetails();
    }
}