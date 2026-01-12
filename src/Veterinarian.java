public class Veterinarian {
    private String name;
    private String phoneNumber;
    private int expYears;

    public Veterinarian(String name, String phoneNumber, int expYears) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.expYears = expYears;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        }
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getExperienceYears() {
        return expYears;
    }

    public void setExperienceYears(int expYears) {
        if (expYears > 0) {
            this.expYears = expYears;
        }
    }
    @Override
    public String toString() {
        return "Veterinarian : " +
                "name = '" + name + '\'' +
                ", phoneNumber = '" + phoneNumber + '\'' +
                ", experienceYears = " + expYears +
                '}';
    }
}