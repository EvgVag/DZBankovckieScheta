public abstract class Account {
    protected int balance;
    int amount;

    public Account(int balance) {
        this.balance = balance;
    }

    abstract boolean pay(int amount);

    abstract boolean transfer(Account account, int amount);

    abstract boolean addMoney(int amount);
}
