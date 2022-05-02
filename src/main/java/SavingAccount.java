public class SavingAccount extends Account {

    public SavingAccount() {
        super(55000);
    }

    @Override
    boolean pay(int amount) {
        System.out.println("Ошибка");
        return false;
    }

    @Override
    boolean transfer(Account account, int amount) {
        if (amount > balance) {
            System.out.println("Недостаточно средств");
            return false;
        } else {
            boolean result = account.addMoney(amount);
            if (result) {
                balance -= amount;
                System.out.println("Перевод на сумму " + amount +
                        ". Баланс вашего счета: " + balance);
            } else {
                System.out.println("Не выполнен.");
            }
            return result;
        }
    }

    @Override
    boolean addMoney(int amount) {
        balance += amount;
        System.out.println("Пополнен " + amount + ". Баланс: " + balance);
        return true;
    }
}
