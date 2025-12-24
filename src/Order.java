import java.util.ArrayList;
import java.util.List;
public class Order {
    private Owner2 owner;
    private Pet2 pet;
    private Veterenarian2 veterinarian;
    private Vaccination2 vaccination;
    private List<Treatment2> treatments = new ArrayList<>();

    public Order(Owner2 owner, Pet2 pet, Veterenarian2 veterinarian, Vaccination2 vaccination, List<Treatment2> treatments) {
        this.owner = owner;
        this.pet = pet;
        this.veterinarian = veterinarian;
        this.vaccination = vaccination;
        this.treatments = treatments;
    }

    public void addTreatment(Treatment2 treatment) {
        treatments.add(treatment);
    }


    public Owner2 getOwner() {
        return owner;
    }

    public void setOwner(Owner2 owner) {
        this.owner = owner;
    }

    public Pet2 getPet() {
        return pet;
    }

    public void setPet(Pet2 pet) {
        this.pet = pet;
    }

    public Veterenarian2 getVeterinarian() {
        return veterinarian;
    }

    public void setVeterinarian(Veterenarian2 veterinarian) {
        this.veterinarian = veterinarian;
    }

    public Vaccination2 getVaccination() {
        return vaccination;
    }

    public void setVaccination(Vaccination2 vaccination) {
        this.vaccination = vaccination;
    }

    public List<Treatment2> getTreatments() {
        return treatments;
    }

    public void setTreatments(List<Treatment2> treatments) {
        this.treatments = treatments;
    }

    @Override
    public String toString() {
        return "Order{" +
                "owner=" + owner +
                ", pet=" + pet +
                ", veterinarian=" + veterinarian +
                ", vaccination=" + vaccination +
                ", treatments=" + treatments +
                '}';
    }

    public Order(Owner2 owner1, Pet2 pet1, Veterenarian2 vet, Treatment2 treatment, Vaccination2 vaccination, Appointment appointment) {

    }

}

