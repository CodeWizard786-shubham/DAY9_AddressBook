import java.util.*;
import java.util.stream.Collectors;

public class AddressBookCollection {
    HashMap<String,AddressBook> addressBooks =new HashMap<>();
    Scanner sc = new Scanner(System.in);

    public void addAddressBooks() throws Exception {
        System.out.println("Enter AddressBook Name: ");
        String addressBookName = sc.next();
        if (addressBooks.containsKey(addressBookName)) {
            System.out.println("AddressBook with this name already exist");
        } else {
            AddressBook contact = new AddressBook(addressBookName);
            addressBooks.put(contact.addressBookName, contact);
            boolean quit = false;
            while (!quit) {
                System.out.println("Address Book");
                System.out.println("1. Add contact");
                System.out.println("2. Update contact");
                System.out.println("3. Remove contact");
                System.out.println("4. Print contacts");
                System.out.println("5. Quit");
                System.out.print("Enter choice: ");
                int choice1 = sc.nextInt();
                sc.nextLine();
                switch (choice1) {
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
                        System.out.println("1.Print all contacts\n2.Print by state");
                        System.out.println("Enter choice");
                        int choice= sc.nextInt();
                        switch (choice){
                            case 1:
                                contact.printContact();
                                break;
                            case 2:
                                System.out.println(contact.searchContactAcrossMultipleAddressBooks());
                                break;
                            default:
                                System.out.println("Invalid choice");
                        }
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
    public void printAddressBooks() {
        addressBooks.forEach((k,v)-> System.out.println("AddressBook Name->"+k+"\n"+v));
    }

    public void removeAddressBooks() {
        System.out.print("Enter the Address Book Name: ");
        String addressBookName = sc.nextLine();
        if (addressBooks.containsKey(addressBookName)) {
            addressBooks.remove(addressBookName);
            System.out.println("Address Book removed: ");
        } else {
            System.out.println("AddressBook Not found: ");
        }
    }

    public Map<String, AddressBook> getAddressBooks() {
        return addressBooks;
    }


}