import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
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


