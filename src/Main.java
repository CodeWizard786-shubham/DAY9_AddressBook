import java.util.*;

public class Main {
    public static void main(String[] args) {
        AddressBook contact = new AddressBook();
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        while (!quit) {
            System.out.println("Address Book");
            System.out.println("1. Add contact");
            System.out.println("2. Update contact");
            System.out.println("3. Remove contact");
            System.out.println("4. Print contacts");
            System.out.println("5. Quit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter number of contacts: ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < n; i++) {
                        contact.addContact();
                        System.out.println("Contact Added");
                    }
                    break;
                case 2:
                    contact.updateContact();

                    break;
                case 3:
                    contact.removeContact();
                    break;
                case 4:
                    contact.printContact();
                    break;
                case 5:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}


