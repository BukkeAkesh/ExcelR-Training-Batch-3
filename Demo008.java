import java.util.Scanner;

public class Demo008 {
    public static void main(String[] args) {
        String originalUsername = "user";
        String originalPhone = "999888";
        String originalAge = "20";

        Scanner scanner = new Scanner(System.in);
        String username;
        String phoneNumber;
        String age;

        do {
            System.out.print("Enter your username: ");
            username = scanner.nextLine();

            System.out.print("Enter your phone number: ");
            phoneNumber = scanner.nextLine();

            System.out.print("Enter your age: ");
            age = scanner.nextLine();
            
        } while (username == originalUsername && phoneNumber == originalPhone && age == originalAge);

        System.out.println("Entered username is " + username);
        System.out.println("Entered phone number is " + phoneNumber);
        System.out.println("Entered age is " + age);

        scanner.close();
    }
}