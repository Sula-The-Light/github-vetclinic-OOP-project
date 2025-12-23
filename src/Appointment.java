public class Appointment {
    private Pet2 pet;
    private Veterenarian2 veterenarian;
    private boolean confirmed;

    public Appointment(Pet2 pet, Veterenarian2 veterenarian, boolean confirmed) {
        this.pet = pet;
        this.veterenarian = veterenarian;
        this.confirmed = confirmed;
    }

    public Pet2 getPet() {
        return pet;
    }

    public void setPet(Pet2 pet) {
        this.pet = pet;
    }

    public Veterenarian2 getVeterenarian() {
        return veterenarian;
    }

    public void setVeterenarian(Veterenarian2 veterenarian) {
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
                "Pet2=" + pet +
                ", Veterenarian2=" + veterenarian +
                ", confirmed=" + confirmed +
                '}';
    }
}
