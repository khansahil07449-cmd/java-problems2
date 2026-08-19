import java.io.*;
import java.util.Scanner;

interface Payment {
    void makePayment(double amount);
    void paymentDetails();
}
class CreditCardPayment implements Payment {
    private String cardNumber;
    private String cardHolderName;
    private double amount;
    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }
    @Override
    public void makePayment(double amount) {
        this.amount = amount;
        System.out.println("Payment Successful!");
    }

    @Override
    public void paymentDetails() {
        System.out.println("Payment Mode : Credit Card");
        System.out.println("Card Holder Name : " + cardHolderName);
        System.out.println("Card Number : " + cardNumber);
        System.out.println("Amount : Rs. " + amount);
    }
}

class UPIPayment implements Payment {
    private String upiId;
    private String userName;
    private double amount;
    public UPIPayment(String upiId, String userName) {
        this.upiId = upiId;
        this.userName = userName;
    }
    @Override
    public void makePayment(double amount) {
        this.amount = amount;
        System.out.println("Payment Successful!");
    }
    @Override
    public void paymentDetails() {
        System.out.println("Payment Mode : UPI");
        System.out.println("User Name : " + userName);
        System.out.println("UPI ID : " + upiId);
        System.out.println("Amount : Rs. " + amount);
    }
}

class CashPayment implements Payment {
    private String customerName;
    private double amount;

    public CashPayment(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void makePayment(double amount) {
        this.amount = amount;
        System.out.println("Payment Successful!");
    }

    @Override
    public void paymentDetails() {
        System.out.println("Payment Mode : Cash");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Amount : Rs. " + amount);
    }
}

public class problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                Payment payment = null;
        System.out.println("  PAYMENT SYSTEM  ");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.println("3. Cash");
        System.out.print("Enter Choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        switch (choice) {
            case 1:
                System.out.print("Enter Card Holder Name: ");
                String cardName = scanner.nextLine();
                System.out.print("Enter Card Number: ");
                String cardNo = scanner.nextLine();
                payment = new CreditCardPayment(cardNo, cardName);
                break;
            case 2:
                System.out.print("Enter User Name: ");
                String userName = scanner.nextLine();
                System.out.print("Enter UPI ID: ");
                String upiId = scanner.nextLine();
                payment = new UPIPayment(upiId, userName);
                break;
            case 3:
                System.out.print("Enter Customer Name: ");
                String customerName = scanner.nextLine();
                payment = new CashPayment(customerName);
                break;
            default:
                System.out.println("Invalid Choice! Exiting...");
                System.exit(0);
        }
        System.out.print("Enter Amount: ");
        double amount = scanner.nextDouble();
        System.out.println();
        payment.makePayment(amount);
        payment.paymentDetails();

        scanner.close();
    }
}
