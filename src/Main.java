import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Main m1 = new Main();
        List<Contacts> AddressBook = new ArrayList<Contacts>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of contacts: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
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
            System.out.println(AddressBook);
        }
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
                System.out.println(AddressBook);
            }
        }

        System.out.println("Enter the First name of the contact to be removed: ");
        String firstname2 = sc.nextLine();
        String firstNameToRemove = firstname2;
        for (int i = 0; i < AddressBook.size(); i++) {
            Contacts contact = AddressBook.get(i);
            if (contact.getFirstName().equals(firstNameToRemove)) {
                AddressBook.remove(i);
            }
        }
        System.out.println(AddressBook);

    }
}


