public class Appointment {
    private Pet pet;
    private Veterinarian veterenarian;
    private boolean confirmed;
    private String date;

    public Appointment(Pet pet, Veterinarian veterenarian, boolean confirmed, String date) {
        setPet(pet);
        setVeterenarian(veterenarian);
        this.confirmed = confirmed;
        this.date = date;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        if (pet != null) {
            this.pet = pet;
        }
    }
    public Veterinarian getVeterenarian() {
        return veterenarian;
    }

    public void setVeterenarian(Veterinarian veterenarian) {
        if (veterenarian != null) {
            this.veterenarian = veterenarian;
        }
    }
    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        if(date != null){
        this.date = date;
    }
}
    @Override
    public String toString() {
        return "Appointment{" +
                "pet=" + pet +
                ", veterenarian=" + veterenarian +
                ", confirmed=" + confirmed +
                ", date='" + date + '\'' +
                '}';
    }
}

