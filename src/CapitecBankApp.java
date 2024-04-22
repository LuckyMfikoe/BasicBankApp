import java.util.Scanner;
import bank.bl.Bank;

/**
 *
 * @author Lesego Mfikoe
 */
public class CapitecBankApp {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter amount in bank: R");
        int currency = sc.nextInt();
        
        Bank bank = new Bank(currency); // Stored amount in bank
        
        System.out.println("Select an operation below");
        System.out.println("""
                           1 -> Deposit
                           2 -> Withdraw
                           3 -> View Balance
                           4 -> Exit""");
        System.out.print("\nYour choice: ");// \n is an escape sequence "Next line"
        int op = sc.nextInt();
        
        while (op != 4)
        {
            switch(op)
            {
                case 1 -> {
                    System.out.print("Enter deposit amount: R");
                    int deposit = sc.nextInt();

                    bank.deposit(deposit);

                    System.out.println("R" + deposit + " hass been deposited\n");
                }
                case 2 -> {
                    System.out.print("Enter withdraw amount: R");
                    int withdraw = sc.nextInt();

                    bank.withdraw(withdraw);

                    System.out.println("R" + withdraw + " hass been withdrawed\n");
                }
                case 3 -> System.out.println("Amount in bank: R" + bank.getCurrency() + "\n");
                case 4 -> System.exit(0);
            }
            
            System.out.println("Select an operation below");
            System.out.println("""
                               1 -> Deposit
                               2 -> Withdraw
                               3 -> View Balance
                               4 -> Exit""");
            System.out.print("\nYour choice: ");
            op = sc.nextInt();
        }
    }
}
