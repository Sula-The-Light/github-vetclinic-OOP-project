public class Main {
    public static void main(String[] args) {
        Pet2 pet1 = new Pet2("Ross", 3, "dog", "male", "temperature");
        Owner2 owner1 = new Owner2(1456453, "Temirlan", "777777", "EXPO");
        Veterenarian2 vet = new Veterenarian2("Birzhan Rukhanov", "666666", 15);
        Treatment2 treatment = new Treatment2("Paracetamol", 3000, 2028);
        Vaccination2 vaccination = new Vaccination2("Calicivirus", "Rabies" , 2025 ,2027);
        Appointment appointment = new Appointment(pet1, vet, true);

        Order order1 = new Order(owner1 , pet1 , vet , treatment , vaccination , appointment);

        System.out.println(order1);
    }

}