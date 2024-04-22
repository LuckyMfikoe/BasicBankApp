package bank.bl;
/**
 *
 * @author Lesego Mfikoe
 */
public class Bank implements BankInterface {
    private int currency;

    public Bank(int currency) {
        this.currency = currency;
    }

    public int getCurrency() {
        return currency;
    }

    public void setCurrency(int currency) {
        this.currency = currency;
    }

    @Override
    public int deposit(int num) {
        return currency+=num;
    }

    @Override
    public int withdraw(int num) {
        return currency-=num;
    }
    
    
}
