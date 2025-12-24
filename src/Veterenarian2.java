public class Veterenarian2 {
    private String name;
    private String phoneNumber;
    private int experienceYears;
    private String specialization;

    public Veterenarian2(String name, String phoneNumber, int experienceYears, String specialization) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.experienceYears = experienceYears;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public boolean isExperienced() {
        return experienceYears >= 10;
    }

    public void addExperience(int years) {
        this.experienceYears += years;
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

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Veterenarian2{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", experienceYears=" + experienceYears +
                ", specialization='" + specialization + '\'' +
                '}';
    }

    public Veterenarian2(String birzhanRukhanov, String number, int i) {


    }
    }












