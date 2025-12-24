public class Appointment {
    private Pet2 pet;
    private Veterenarian2 veterenarian;
    private boolean confirmed;
    private String date;


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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Appointment(Pet2 pet1, Veterenarian2 vet, boolean b, String owaGr) {


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




