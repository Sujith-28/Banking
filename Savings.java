public class Savings extends BankAccount {
    static int withdrawLimit = 3;
    String accountType = new String("Savings");

    Savings(String name, int age, int accountNumber, int accountBalance) {
        super(name, age, accountNumber, accountBalance);
    }

    Savings(String name, int age, int accountNumber) {
        super(name, age, accountNumber);
    }

    int accountNumber = getAccountNumber();
    int accountBalance = getAccountBalance();
    String name = getName();
    int age = getAge();


    void checkBalance() {
        System.out.println("Current balance: " + this.accountBalance);
    }

    void displayDetails() {
        System.out.println("Account Holder Details");
        System.out.println("Name : " + this.name);
        System.out.println("Age of the account holder : " + this.age);
        System.out.println("Account Number : " + this.accountNumber);
        System.out.println("Account Type: "+this.accountType);
        System.out.println("Account Balance : " + this.accountBalance);
        System.out.println();
    }

    void withdrawAmount(int amount) {
        if(withdrawLimit == 0){
            System.out.println("Withdrawal Limit Reached");
            return;
        }

        if(accountBalance < amount){
            System.out.println("Not enough Balance\nCurrent account balance is: "+accountBalance);
            withdrawLimit--;
            return;
        }

        accountBalance -= amount;
        System.out.println("Amount Received : "+amount);
        System.out.println("Current account Balance: "+accountBalance);
    }

    void addMoney(int amount){
        this.accountBalance += amount;
    }

    boolean reduceMoney(int amount){
        if(this.accountBalance < amount){
            System.out.println("Not enough balance");
            return false;
        }

        accountBalance -= amount;
        return true;
    }
}