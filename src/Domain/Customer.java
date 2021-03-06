package Domain;

/**
 * Created by Sebas on 26-04-2017.
 */
public class Customer {
    private long id;
    private String fName;
    private String lName;
    private String mail;
    private String phoneNo;
    private String address;
    private int zip;

    /**
     * Constructor used for creating new customers.
     * @param fName
     * @param lName
     * @param mail
     * @param phoneNo
     * @param address
     * @param zip
     */
    public Customer(String fName, String lName, String mail, String phoneNo, String address, int zip) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.mail = mail;
        this.phoneNo = phoneNo;
        this.address = address;
        this.zip = zip;
    }

    /**
     * Constructor for already existing customer.
     * @param id
     * @param fName
     * @param lName
     * @param mail
     * @param phoneNo
     * @param address
     * @param zip
     */
    public Customer(long id, String fName, String lName, String mail, String phoneNo, String address, int zip) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.mail = mail;
        this.phoneNo = phoneNo;
        this.address = address;
        this.zip = zip;
    }

    public long getId() {
        return id;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getMail() {
        return mail;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public int getZip() {
        return zip;
    }
}
