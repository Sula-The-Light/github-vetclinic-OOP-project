public class Veterinarian {
    private String fullname;
    private int experience;

    public Veterinarian(String fullname, int experience) {
        if (fullname == null || fullname.isBlank()) {
            throw new IllegalArgumentException("Vet name required");
        }
        if (experience < 0) {
            throw new IllegalArgumentException("Experience cannot be negative");
        }
        this.fullname = fullname;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Veterinarian : " + fullname + " (" + experience + " years)";
    }
}
