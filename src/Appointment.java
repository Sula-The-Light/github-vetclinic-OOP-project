public class Appointment {
    private Pet pet;
    private Veterenarian veterenarian;
    private boolean confirmed;

    public Appointment(Pet pet, Veterenarian veterenarian, boolean confirmed) {
        this.pet = pet;
        this.veterenarian = veterenarian;
        this.confirmed = confirmed;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Veterenarian getVeterenarian() {
        return veterenarian;
    }

    public void setVeterenarian(Veterenarian veterenarian) {
        this.veterenarian = veterenarian;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "Pet=" + pet +
                ", Veterenarian=" + veterenarian +
                ", confirmed=" + confirmed +
                '}';
    }
}
