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
        return "Owner: %s | Pet: %s | Vet: %s | Treatment: %s".formatted(
                owner,
                pet,
                veterinarian,
                treatment
        );
    }
}