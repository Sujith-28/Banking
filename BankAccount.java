abstract class BankAccount {
    private String name;
    private int age;
    private int accountNumber;
    private int accountBalance;



    // Constructors
    BankAccount(){}

    BankAccount(String name, int age, int accountNumber) {
        this.name = name;
        this.age = age;
        this.accountNumber = accountNumber;
        this.accountBalance = 0;
    }

    BankAccount(String name, int age, int accountNumber, int accountBalance) {
        this.name = name;
        this.age = age;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;

    }

    // Getters
    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    int getAccountNumber() {
        return accountNumber;
    }

    int getAccountBalance() {
        return accountBalance;
    }

    // Methods
    abstract void checkBalance();

    abstract void displayDetails();

    abstract void withdrawAmount(int amount);

    abstract void addMoney(int amount);

    abstract boolean reduceMoney(int amount);

}