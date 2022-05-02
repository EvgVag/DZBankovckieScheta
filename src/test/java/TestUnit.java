import com.sun.jdi.connect.Connector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestUnit {
    @org.junit.jupiter.api.Test
    public void testConcat_validArgument_success() {

        SavingAccount savingAccount = new SavingAccount();
        ChekingAccount chekingAccount = new ChekingAccount();
        int amount = 100;
        int exepted = 54900;

        savingAccount.transfer(chekingAccount, amount);
        int result = savingAccount.balance;

        Assertions.assertTrue(true);
        Assertions.assertEquals(exepted, result);
    }

    @org.junit.jupiter.api.Test
    public void testPayAccount() {
        SavingAccount savingAccount = new SavingAccount();
        int amount = 56000;
        boolean result = savingAccount.pay(amount);
        Assertions.assertFalse(result);

    }

    @ParameterizedTest
    @MethodSource("methodSource")
    public void testParamMetodSourceAddMoney(int amount, int expected) {
        ChekingAccount checkingAccount = new ChekingAccount();
        checkingAccount.addMoney(amount);
        int result = checkingAccount.balance;
        Assertions.assertEquals(expected, result);
    }

    static Stream<Arguments> methodSource() {
        return Stream.of(
                Arguments.of(300, 10300),
                Arguments.of(500, 10500)
        );
    }

}
