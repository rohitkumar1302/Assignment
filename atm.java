// package class.project;
import java.util.Scanner;

public class atm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 0, n;
        System.out.println("     Welcome to ATM(Automated Teller Machine )  ");
        do {
            System.out.println("Enter 1. for check money ");
            System.out.println("Enter 2. for deposit money");
            System.out.println("Enter 3. for Withdraw money");
            int a = sc.nextInt();

            switch (a) {
                case 1: {
                    System.out.println(balance);

                    break;
                }
                case 2: {
                    System.out.println("Enter the amount you want to deposit");
                    balance = balance + sc.nextInt();
                    break;
                }
                case 3: {
                    System.out.println("Enter the amount you want to Withdraw");
                    balance = balance - sc.nextInt();
                    break;
                }
                default:
                    System.out.println("wrong  Input please check");
                    break;
            }
            System.out.println("Enter 1 if you want to continue or 2 if you want to exit");
            n = sc.nextInt();
        } while (n == 1);

        System.out.println("Thank you");

    }
}
