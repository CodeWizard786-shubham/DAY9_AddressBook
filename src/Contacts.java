public class Contacts {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zip;
    private long phoneNumber;
    private String email;


    public String getFirstName(){

        return firstName;
    }
    public String getLastName() {

        return lastName;
    }

    public String getAddress() {

        return address;
    }

    public String getCity() {

        return city;
    }

    public String getState() {

        return state;
    }

    public int getZip() {

        return zip;
    }

    public long getPhoneNumber() {

        return phoneNumber;
    }

    public String getEmail() {

        return email;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Contacts(int id,String f, String l, String a, String c, String s, int z, long p, String e) {
        this.id=id;
        this.firstName = f;
        this.lastName = l;
        this.address = a;
        this.city = c;
        this.state = s;
        this.zip = z;
        this.phoneNumber = p;
        this.email = e;

    }
    public String toString(){
        return (
                "First Name : " + getFirstName() + "; Last Name :  " + getLastName() + "; Address : " + getAddress() + "; City : "+ getCity()+ "; State : " + getState() + "; Zip : " + getZip() + "; PhoneNumber : " + getPhoneNumber() + "; Email : "+ getEmail()
        );
    }

}
