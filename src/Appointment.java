public class Appointment {
    private Pet pet;
    private Veterinarian veterenarian;
    private boolean confirmed;
    private String date;

    public boolean confirm() {
        this.confirmed = true;
        return confirmed;
    }

    public String getStatus() {
        return confirmed ? "Confirmed" : "Not confirmed";
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Veterinarian getVeterenarian() {
        return veterenarian;
    }

    public void setVeterenarian(Veterinarian veterenarian) {
        this.veterenarian = veterenarian;
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
        this.date = date;
    }

    public Appointment(Pet pet, Veterinarian veterenarian, boolean confirmed, String date) {
        this.pet = pet;
        this.veterenarian = veterenarian;
        this.confirmed = confirmed;
        this.date = date;
    }


    @Override
    public String toString() {
        return "Appointment {" +
                "pet = " + pet +
                ", veterenarian = " + veterenarian +
                ", confirmed = " + confirmed +
                ", date = '" + date + '\'' +
                '}';
    }
}




