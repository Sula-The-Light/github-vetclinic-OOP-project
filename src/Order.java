public class Order {
    private Owner owner;
    private Pet pet;
    private Veterinarian veterinarian;
    private String treatment;
    public Order(Owner owner, Pet pet, Veterinarian veterinarian, String treatment) {
        this.owner = owner;
        this.pet = pet;
        this.veterinarian = veterinarian;
        this.treatment = treatment;
    }
    @Override
    public String toString() {
        return """
                🧾 Vet Order
                Owner: %s
                Pet: %s
                Veterinarian: %s
                Treatment: %s
                Vaccination: %s
                """.formatted(owner, pet, veterinarian, treatment);
    }
}
