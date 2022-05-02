public class CreditAccount extends Account {


    public CreditAccount() {
        super(0);
    }

    @Override
    boolean pay(int amount) {
        balance -= amount;
        System.out.println("Расход в размере " + amount + ". Баланс: " + balance);
        return true;
    }

    @Override
    boolean transfer(Account account, int amount) {
        balance -= amount;
        System.out.println("Перевод на сумму " + amount +
                ". Баланс: " + balance);
        account.addMoney(amount);
        return true;
    }

    @Override
    boolean addMoney(int amount) {
        int addBalance = 0;
        addBalance = balance + amount;
        if (addBalance <= 0) {
            balance += amount;
            System.out.println("Пополнение на " + amount + ". Баланс счета: " + balance);
            return true;
        } else {
            int depositAmount = 0;
            depositAmount -= balance;
            System.out.println("Не может превышать " + depositAmount);
            return false;
        }
    }

}
