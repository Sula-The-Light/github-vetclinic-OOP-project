import java.util.ArrayList;
import java.util.List;
public class Order {
    private Owner owner;
    private Pet pet;
    private Veterenarian veterinarian;
    private Vaccination vaccination;
    private List<Treatment> treatments = new ArrayList<>();

    public Order(Owner owner, Pet pet, Veterenarian veterinarian, Treatment treatment, Vaccination vaccination, Appointment appointment) {
        this.owner = owner;
        this.pet = pet;
        this.veterinarian = veterinarian;
        this.vaccination = vaccination;
    }

    public List<Treatment> getTreatments() {
        return treatments;
    }

    public double getTotalPrice() {
        double total = 6000;
        for (Treatment t : treatments) {
            total += t.getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Order{" +
                "\nOwner=" + owner +
                ",\nPet=" + pet +
                ",\nVeterinarian=" + veterinarian +
                ",\nVaccination=" + vaccination +
                ",\nTreatments=" + treatments +
                ",\nTotal price=" + getTotalPrice() +
                "\n}";
    }
}