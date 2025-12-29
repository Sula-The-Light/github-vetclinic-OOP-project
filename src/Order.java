import java.util.ArrayList;
import java.util.List;
public class Order {
    private Owner owner;
    private Pet pet;
    private Veterinarian veterinarian;
    private Vaccination vaccination;
    private List<Treatment> treatments = new ArrayList<>();

    public Order(Owner owner, Pet pet, Veterinarian veterinarian, Vaccination vaccination) {
        this.owner = owner;
        this.pet = pet;
        this.veterinarian = veterinarian;
        this.vaccination = vaccination;
    }

    @Override
    public String toString() {
        return "Order : " +
                "owner = " + owner +
                ", pet = " + pet +
                ", veterinarian = " + veterinarian +
                ", vaccination = " + vaccination +
                ", treatments = " + treatments +
                '}';
    }
}
