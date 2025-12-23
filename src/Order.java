import java.util.ArrayList;
import java.util.List;
public class Order {
    private Owner2 owner;
    private Pet2 pet;
    private Veterenarian2 veterinarian;
    private Vaccination2 vaccination;
    private List<Treatment2> treatments = new ArrayList<>();

    public Order(Owner2 owner, Pet2 pet, Veterenarian2 veterinarian, Treatment2 treatment, Vaccination2 vaccination, Appointment appointment) {
        this.owner = owner;
        this.pet = pet;
        this.veterinarian = veterinarian;
        this.vaccination = vaccination;
    }

    public List<Treatment2> getTreatments() {
        return treatments;
    }

    public double getTotalPrice() {
        double total = 6000;
        for (Treatment2 t : treatments) {
            total += t.getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Order{" +
                "\nOwner2=" + owner +
                ",\nPet2=" + pet +
                ",\nVeterinarian=" + veterinarian +
                ",\nVaccination2=" + vaccination +
                ",\nTreatments=" + treatments +
                ",\nTotal price=" + getTotalPrice() +
                "\n}";
    }
}