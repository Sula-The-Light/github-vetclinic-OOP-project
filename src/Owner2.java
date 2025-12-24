public class Owner2 {
    private long id;
    private String name;
    private String phoneNumber;
    private String  address;

    public Owner2(long id, String name, String phoneNumber, String address) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public void updateContactInfo(String newPhone, String newAddress) {
        this.phoneNumber = newPhone;
        this.address = newAddress;
    }

    public boolean hasValidPhoneNumber() {
        return phoneNumber != null && phoneNumber.length() >= 6;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Owner2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public Owner2(int i, String temirlan, String number, String expo) {

    }
    }

