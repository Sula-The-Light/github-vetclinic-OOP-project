package Model;
public class Order {
    private Owner owner;
    private Pet pet;
    private Veterinarian veterinarian;
    private Treatment treatment;
    public Order(Owner owner, Pet pet, Veterinarian veterinarian, Treatment treatment) {
        this.owner = owner;
        this.pet = pet;
        this.veterinarian = veterinarian;
        this.treatment = treatment;
    }
    @Override
    public String toString() {
        return "Order: %s | Model.Pet: %s | Vet: %s | Model.Treatment: %s".formatted(
                owner,
                pet,
                veterinarian,
                treatment
        );
    }
    public double getTotalPrice() {
        return 0;
    }
    public Owner getOwner() {
        return owner;
    }
    public Pet getPet() {
        return pet;
    }
    public Veterinarian getVeterinarian() {
        return veterinarian;
    }
    public Treatment getTreatment() {
        return treatment;
    }
}