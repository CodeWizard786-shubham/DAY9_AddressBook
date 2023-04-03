import java.util.HashMap;
import java.util.Scanner;

public class AddressBook{
    HashMap<Integer, Contacts> AddressBook = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    public void addContact() {
        System.out.print("Enter Id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter First name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter Last name: ");
        String lastName = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        System.out.print("Enter City: ");
        String city = sc.nextLine();

        System.out.print("Enter State: ");
        String state = sc.nextLine();

        System.out.print("Enter Zip: ");
        int zip = sc.nextInt();

        System.out.print("Enter Phone Number: ");
        long phoneNumber = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        Contacts c1 = new Contacts(id,firstName, lastName, address, city, state, zip, phoneNumber, email);
        AddressBook.put(id,c1);
    }

    public void updateContact() {
        System.out.print("Enter the id of the contact to be changed: ");
        Integer id = sc.nextInt();
        sc.nextLine();
        for (Integer contact : AddressBook.keySet()) {
            if (AddressBook.containsKey(id)) {
                System.out.print("Enter First name: ");
                String firstName = sc.nextLine();

                System.out.print("Enter Last name: ");
                String lastName = sc.nextLine();

                System.out.print("Enter Address: ");
                String address = sc.nextLine();

                System.out.print("Enter City: ");
                String city = sc.nextLine();

                System.out.print("Enter State: ");
                String state = sc.nextLine();

                System.out.print("Enter Zip: ");
                int zip = sc.nextInt();

                System.out.print("Enter Phone Number: ");
                long phoneNumber = sc.nextLong();
                sc.nextLine();

                System.out.print("Enter Email:");
                String email = sc.nextLine();
                Contacts c1=AddressBook.get(id);
                c1.setFirstName(firstName);
                c1.setLastName(lastName);
                c1.setAddress(address);
                c1.setCity(city);
                c1.setState(state);
                c1.setZip(zip);
                c1.setPhoneNumber(phoneNumber);
                c1.setEmail(email);
                AddressBook.put(id,c1);
                System.out.println("Contact Updated");
            }else{
                System.out.println("Contact not found: " + id);
            }
        }
    }

    public void removeContact() {
        System.out.print("Enter the Id of the contact to be removed: ");
        int id = sc.nextInt();
        if (AddressBook.containsKey(id)) {
            AddressBook.remove(id);
            System.out.println("Contact removed: " + id);
        } else {
            System.out.println("Contact not found: " + id);
        }
    }
    public void printContact() {
        System.out.println("Address Book:");
        if (AddressBook.isEmpty()) {
            System.out.println("Address Book is empty");
        } else {
            for (Integer id : AddressBook.keySet()) {
                System.out.println(id + " - " + AddressBook.get(id));
            }
        }
    }

}
