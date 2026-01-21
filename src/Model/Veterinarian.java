package Model;
public class Veterinarian {
    private String fullname;
    private int experience;
    public Veterinarian(String fullname, int experience) {
        this.fullname = fullname;
        this.experience = experience;
    }
    public void setFullname(String fullname) {
        if (fullname == null || fullname.isBlank()) {
            throw new IllegalArgumentException("Vet name required");
        }
        this.fullname = fullname;
    }
    public void setExperience(int experience) {
        if (experience < 0) {
            throw new IllegalArgumentException("Experience cannot be negative");
        }
        this.experience = experience;
    }
    @Override
    public String toString() {
        return "Veterinarian : " +
                "fullname = " + fullname +
                ", experience = " + experience + " years";
    }
}
