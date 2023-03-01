interface BankTransfer {
    void Transaction(int accountNumber1, int accountNumber2, int amount);
    void Deposit(int accountNumber, int amount);
}