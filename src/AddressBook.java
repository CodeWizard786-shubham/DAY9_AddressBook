
import java.util.Scanner;
     public class AddressBook {
         private String firstName;
         private String lastName;
         private String address;
         private String city;
         private String state;
         private String zip;
         private String phoneNumber;
         private String email;

         public AddressBook(String firstName, String lastName, String address, String city, String state, String zip, String phoneNumber, String email) {
             this.firstName = firstName;
             this.lastName = lastName;
             this.address = address;
             this.city = city;
             this.state = state;
             this.zip = zip;
             this.phoneNumber = phoneNumber;
             this.email = email;
         }
         public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);

             System.out.print("Enter First Name: ");
             String firstName = sc.nextLine();

             System.out.print("Enter Last Name: ");
             String lastName = sc.nextLine();

             System.out.print("Enter Address: ");
             String address = sc.nextLine();

             System.out.print("Enter City: ");
             String city = sc.nextLine();

             System.out.print("Enter State: ");
             String state = sc.nextLine();

             System.out.print("Enter Zip Code: ");
             String zip = sc.nextLine();

             System.out.print("Enter Phone Number: ");
             String phoneNumber = sc.nextLine();

             System.out.print("Enter Email: ");
             String email = sc.nextLine();

             AddressBook contact = new AddressBook(firstName, lastName, address, city, state, zip, phoneNumber, email);

             System.out.println("Contact Details:");
             System.out.println("First Name: " + contact.firstName);
             System.out.println("Last Name: " + contact.lastName);
             System.out.println("Address: " + contact.address);
             System.out.println("City: " + contact.city);
             System.out.println("State: " + contact.state);
             System.out.println("Zip Code: " + contact.zip);
             System.out.println("Phone Number: " + contact.phoneNumber);
             System.out.println("Email: " + contact.email);
         }
     }


