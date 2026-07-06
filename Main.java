import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount("Renuka", 5000);

        while (true) {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Amount: ");
                    account.deposit(sc.nextDouble());
                    break;

                case 2:
                    System.out.print("Enter Amount: ");
                    account.withdraw(sc.nextDouble());
                    break;

                case 3:
                    account.showBalance();
                    break;

                case 4:
                    account.showTransactions();
                    break;

                case 5:
                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
