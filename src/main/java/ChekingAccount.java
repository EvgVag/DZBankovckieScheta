public class ChekingAccount extends Account { //расчетный счет

    public ChekingAccount() {
        super(10000);
    }

    @Override
    boolean pay(int amount) {
        if (amount < balance) {
            balance -= amount;
            System.out.println("Расход в размере " + amount + ". Баланс: " + balance);
            return true;
        } else {
            System.out.println("Ошибка");
            return false;
        }
    }

    @Override
    boolean transfer(Account account, int amount) {
        if (amount > balance) {
            System.out.println("Ошибка");
            return false;
        } else {
            boolean result = account.addMoney(amount);
            if (result) {
                balance -= amount;
                System.out.println("Перевод на сумму " + amount +
                        ". Оставшийся баланс: " + balance);
            } else {
                System.out.println("Ошибка");
            }
            return result;
        }
    }

    @Override
    boolean addMoney(int amount) {
        balance += amount;
        System.out.println("Счет пополнен на " + amount + ". Баланс: " + balance);
        return true;
    }

}
