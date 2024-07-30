import java.util.Scanner;

public class BankingApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize a BankAccount object
        BankAccount account = new BankAccount(123456, "John Doe", 1000.0);

        int choice;
        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    account.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 4:
                    account.displayAccountInfo();
                    break;
                case 5:
                    System.out.println("Exiting the application. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from the menu.");
                    break;
            }

            System.out.println(); // Print a blank line for better readability

        } while (choice != 5);

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("==== Banking Menu ====");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Display Account Information");
        System.out.println("5. Exit");
        System.out.println("====================");
    }
}
