import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    List<Contacts> AddressBook = new ArrayList<Contacts>();
    Scanner sc = new Scanner(System.in);

    public List<Contacts> addContact() {
        System.out.print("Enter First name:");
        String firstName = sc.nextLine();

        System.out.print("Enter Last name:");
        String lastName = sc.nextLine();

        System.out.print("Enter Address:");
        String address = sc.nextLine();

        System.out.print("Enter City:");
        String city = sc.nextLine();

        System.out.print("Enter State:");
        String state = sc.nextLine();

        System.out.print("Enter Zip:");
        int zip = sc.nextInt();

        System.out.print("Enter Phone Number:");
        long phoneNumber = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter Email:");
        String email = sc.nextLine();
        Contacts c1 = new Contacts(firstName, lastName, address, city, state, zip, phoneNumber, email);
        AddressBook.add(c1);
        return AddressBook;

    }

    public List<Contacts> updateContact() {
        System.out.println("Enter the First name of the contact to be changed: ");
        String firstname1 = sc.nextLine();
        for (Contacts contact : AddressBook) {
            if (contact.getFirstName().equals(firstname1)) {
                System.out.print("Enter First name:");
                String firstName = sc.nextLine();

                System.out.print("Enter Last name:");
                String lastName = sc.nextLine();

                System.out.print("Enter Address:");
                String address = sc.nextLine();

                System.out.print("Enter City:");
                String city = sc.nextLine();

                System.out.print("Enter State:");
                String state = sc.nextLine();

                System.out.print("Enter Zip:");
                int zip = sc.nextInt();

                System.out.print("Enter Phone Number:");
                long phoneNumber = sc.nextLong();
                sc.nextLine();

                System.out.print("Enter Email:");
                String email = sc.nextLine();
                contact.setFirstName(firstName);
                contact.setLastName(lastName);
                contact.setAddress(address);
                contact.setCity(city);
                contact.setState(state);
                contact.setZip(zip);
                contact.setPhoneNumber(phoneNumber);
                contact.setEmail(email);

            }
        }
        return AddressBook;
    }

    public List<Contacts> removeContact() {
        System.out.println("Enter the First name of the contact to be removed: ");
        String firstname2 = sc.nextLine();
        String firstNameToRemove = firstname2;
        for (int i = 0; i < AddressBook.size(); i++) {
            Contacts contact = AddressBook.get(i);
            if (contact.getFirstName().equals(firstNameToRemove)) {
                AddressBook.remove(i);
                System.out.println("Contact Removed");
            }
        }
        return AddressBook;
    }

    public void printContact() {
        System.out.println(AddressBook);
    }


    public static void main(String[] args) {
        Main m1 = new Main();
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
                        m1.addContact();
                        System.out.println("Contact Added");
                    }
                    break;
                case 2:
                    m1.updateContact();
                    System.out.println("Contact Updated");
                    break;
                case 3:
                    m1.removeContact();
                    break;
                case 4:
                    m1.printContact();
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


