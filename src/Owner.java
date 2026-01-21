public class Owner {
    private String name;
    private String phonenumber;
    public Owner(String name , String phonenumber) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Owner name required");
        }
        this.name = name;

        if (phonenumber == null || phonenumber.isBlank()) {
            throw new IllegalArgumentException("Owner name required");
        }
        this.phonenumber = phonenumber;
    }
    @Override
    public String toString() {
        return "Owner : " +
                "name = " + name +
                ", phonenumber = " + phonenumber;
    }
}
