import java.util.*;
import java.util.stream.Collectors;

public class Main {
    HashMap<String,AddressBookCollection> collections=new HashMap<>();
    Scanner sc=new Scanner(System.in);
    public List<Contacts> searchContactAcrossMultipleAddressBooks(){
        System.out.println("Enter State name: ");
        String stateName= sc.nextLine();
        return   collections.values().stream()
                .flatMap(collection -> collection.getAddressBooks().values().stream())
                .filter(addressBook -> addressBook.getState().equals(stateName))
                .flatMap(addressBook -> addressBook.getContacts().values().stream())
                .collect(Collectors.toList());
    }
    public static void main(String[] args) throws Exception {
        Main m1=new Main();
        AddressBookCollection addressBookCollection=new AddressBookCollection();
        Scanner sc=new Scanner(System.in);
        boolean quit = false;
        while(!quit){
            System.out.println("Address Book");
            System.out.println("1. Add AddressBook");
            System.out.println("2. Display AddressBook");
            System.out.println("3. Remove AddressBook");
            System.out.println("4. Quit");
            System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                addressBookCollection.addAddressBooks();
                break;
            case 2:
                addressBookCollection.printAddressBooks();
                System.out.println(m1.searchContactAcrossMultipleAddressBooks());
                break;
            case 3:
                addressBookCollection.removeAddressBooks();
                break;
            case 4:
                quit = true;
                break;
            default:
                System.out.println("Invalid choice.");
        }


    }
}
}


