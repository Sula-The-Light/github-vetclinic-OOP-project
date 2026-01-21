package Model;
public class Owner {
    private String name;
    private String phonenumber;
    public Owner(String name, String phonenumber) {
        this.name = name;
        this.phonenumber = phonenumber;
    }
    public void setName(String name) {
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("Name required");
        this.name = name;
    }
    public void setPhonenumber(String phonenumber) {
        if (phonenumber == null || phonenumber.isBlank())
            throw new IllegalArgumentException("Phonenumber required");
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return "Owner : " +
                "name = " + name + '\'' +
                ", phonenumber = " + phonenumber;
    }
}