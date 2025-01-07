import java.util.Scanner;

class Customer {
    String Cust_Name = "Hemanth";
    int Account_No = 12345678;
    Double Balance = 10000.00;

    void accept_details() {
        System.out.println("Enter Your Name , Account_Number");
        Scanner sc = new Scanner(System.in);
        Cust_Name = sc.nextLine();
        Account_No = sc.nextInt();
    }

    void display_details() {
        System.out.println("Hello " + Cust_Name);
        System.out.println("Your balance is " + Balance);
    }
}

public class Demo010 {
    public static void main(String[] args) {
        Customer c = new Customer(); // Corrected 'Customer c'
        c.accept_details(); // Calls the method to accept user details
        c.display_details(); // Calls the method to display user details
    }
}