import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Ross", 3, "dog", "male", "temperature");
        Owner owner1 = new Owner(1456453, "Temirlan", "777777", "EXPO");
        Veterenarian vet = new Veterenarian("Birzhan Rukhanov", "666666", 10);
        Treatment treatment = new Treatment("Paracetamol", 3000, 2028);
        Vaccination vaccination = new Vaccination("Calicivirus", "Rabies" , 2025 ,2027);
        Appointment appointment = new Appointment(pet1, vet, true);

        Order order1 = new Order(owner1 , pet1 , vet , treatment , vaccination , appointment);

        System.out.println(order1);
    }

}