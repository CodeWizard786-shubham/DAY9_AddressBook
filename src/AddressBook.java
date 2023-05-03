import java.util.*;
import java.util.regex.Pattern;
import java.lang.Exception;
import java.util.stream.Collectors;

public class AddressBook{
    String addressBookName;
    public AddressBook(String name) {
        this.addressBookName = name;
    }

    public String getName() {
        return addressBookName;
    }
    public Map<String, Contacts> getAddressBook() {
        return AddressBook;
    }
    HashMap<String, Contacts> AddressBook = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    public void addContact() throws Exception {
        System.out.print("Enter First name: ");
        String firstName = sc.nextLine();
        if (!AddressBook.containsKey(firstName)) {
            System.out.print("Enter Last name: ");
            String lastName = sc.nextLine();

            System.out.print("Enter Address: ");
            String address = sc.nextLine();

            System.out.print("Enter City: ");
            String city = sc.nextLine();

            System.out.print("Enter State: ");
            String state = sc.nextLine();

            System.out.print("Enter pin-code: ");
            String pin = sc.nextLine();
            try{
                 checkPinCode(pin);
             }catch (Exception e){
                 throw new Exception("Zip code not valid");
              }

            System.out.print("Enter Phone Number: ");
            long phoneNumber = sc.nextLong();
            sc.nextLine();
            try {
                checkPhoneNumber(phoneNumber);
            } catch (Exception e) {
                throw new Exception("Phone Number not valid");
            }

            System.out.print("Enter Email: ");
            String email = sc.nextLine();
            try {
                checkMail(email);
            } catch (Exception e) {
                throw new Exception("Email not valid");
            }

            Contacts c1 = new Contacts(firstName, lastName, address, city, state, pin, phoneNumber, email);
            AddressBook.put(firstName, c1);
        }else {
            System.out.println("Contact with the same name already exist");
        }
    }

    public void updateContact() throws Exception{
        System.out.print("Enter the FirstName of the contact to be changed: ");
        String firstName = sc.nextLine();
            if (AddressBook.containsKey(firstName)) {
                System.out.print("Enter First name: ");
                String firstName1 = sc.nextLine();

                System.out.print("Enter Last name: ");
                String lastName = sc.nextLine();

                System.out.print("Enter Address: ");
                String address = sc.nextLine();

                System.out.print("Enter City: ");
                String city = sc.nextLine();

                System.out.print("Enter State: ");
                String state = sc.nextLine();

                System.out.print("Enter Zip: ");
                String zip = sc.nextLine();

                System.out.print("Enter Phone Number: ");
                long phoneNumber = sc.nextLong();
                sc.nextLine();
                try {
                    checkPhoneNumber(phoneNumber);
                }
                catch (Exception e){
                    throw new Exception("Phone Number not valid");
                }

                System.out.print("Enter Email: ");
                String email = sc.nextLine();
                try {
                    checkMail(email);
                }
                catch (Exception e){
                    throw new Exception("Email not valid");
                }
                Contacts c1=AddressBook.get(firstName);
                c1.setFirstName(firstName1);
                c1.setLastName(lastName);
                c1.setAddress(address);
                c1.setCity(city);
                c1.setState(state);
                c1.setZip(zip);
                c1.setPhoneNumber(phoneNumber);
                c1.setEmail(email);
                AddressBook.put(firstName,c1);
                System.out.println("Contact Updated");
            }else{
                System.out.println("Contact not found: " + firstName);
            }
        }

    public void removeContact()throws Exception {
        System.out.print("Enter the FirstName of the contact to be changed: ");
        String firstName1 = sc.nextLine();
        if (AddressBook.containsKey(firstName1)) {
            AddressBook.remove(firstName1);
            System.out.println("Contact removed: " + firstName1);
        } else {
            System.out.println("Contact not found: " + firstName1);
        }
    }
    public void printContact() throws Exception{
        System.out.println("AddressBook Contacts:");
        if (AddressBook.isEmpty()) {
            System.out.println("Address Book is empty");
        } else {
            for (String firstName : AddressBook.keySet()) {
                System.out.println(AddressBook.get(firstName));
            }
        }
    }
    public List<Contacts> searchContactAcrossMultipleAddressBooks(){
        System.out.println("Enter State name: ");
        String stateName= sc.nextLine();
        List<Contacts>l1=AddressBook.values().stream().filter(addressBook -> addressBook.getState().equals(stateName)).collect(Collectors.toList());
        return l1;
    }
    public long checkPhoneNumber(long phoneNumber) throws Exception{
        String phoneNumberPattern="^[6-9]\\d{2}[\\s-]?\\d{3}[\\s-]?\\d{4}$";
        String phoneNumberValidation=Long.toString(phoneNumber);
        boolean b =Pattern.matches(phoneNumberPattern,phoneNumberValidation);
        if (!b) {
            throw new RuntimeException();
        }
        return phoneNumber;
    }
    public String checkMail(String email) throws Exception{
            String emailValidation="^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
            boolean b =Pattern.matches(emailValidation,email);
            if (!b) {
                throw new RuntimeException();
            }
            return email;
    }
    public String checkPinCode(String zipcode){
        String pinCodePattern="[1-9]{1}[0-9]{2}[0-9]{3}$";
        boolean b = Pattern.matches(pinCodePattern,zipcode);
        if(!b){
            throw new RuntimeException();
        }
        return zipcode;
    }

    @Override
    public String toString() {
        return
                "AddressBookContacts->" + AddressBook;
    }
    public Contacts getState(){
        return AddressBook.get(getState());
    }
    public Map<String,Contacts> getContacts() {
        return AddressBook;
    }
}



