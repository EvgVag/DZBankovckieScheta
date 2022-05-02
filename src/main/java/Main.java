public class Main {

    public static void main(String[] args) {
        ChekingAccount chekingAccount = new ChekingAccount();
        SavingAccount savingAccount = new SavingAccount();
        CreditAccount creditAccount = new CreditAccount();

        savingAccount.transfer(chekingAccount, 500);
        System.out.println();
        savingAccount.transfer(creditAccount, 150);
        System.out.println();
        chekingAccount.addMoney(5000);
        System.out.println();
        creditAccount.pay(50);
        System.out.println();
        creditAccount.addMoney(30);
        System.out.println();
        chekingAccount.transfer(creditAccount, 15);
        System.out.println();
        chekingAccount.transfer(creditAccount, 5);
        System.out.println();
        savingAccount.pay(250);
    }
}
