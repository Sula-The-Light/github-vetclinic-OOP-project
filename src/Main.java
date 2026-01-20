import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    private static ArrayList<Owner> owners = new ArrayList<>();
    private static ArrayList<Pet> pets = new ArrayList<>();
    private static ArrayList<Veterinarian> veterinarians = new ArrayList<>();
    private static ArrayList<Order> vetOrders = new ArrayList<>();
    private static ArrayList<Treatment> treatments = new ArrayList<>();


    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // TEST DATA
        owners.add(new Owner("Yesmagzam Sultan Talgatuly", "+77057839267"));
        pets.add(new Cat("Tom", 2) {
            @Override
            public String getType() {
                return "Cat";
            }
        });
        pets.add(new Dog("Ross", 3) {
            @Override
            public String getType() {
                return "Dog";
            }
        });

        veterinarians.add(new Veterinarian("Yesmagzam Rauan Talgatuly",  10));
        treatments.add(new Treatment("Antibiotics", 5000.0));
        treatments.add(new Treatment("Vitamins", 2500.0));
        treatments.add(new Treatment("Painkillers", 3500.0));

        boolean running = true;
        while (running) {
            displayMenu();
            int choice = readInt("Choose option: ");
            switch (choice) {
                case 1 -> addOwner();
                case 2 -> viewOwners();
                case 3 -> addPet();
                case 4 -> viewPets();
                case 5 -> addVeterinarian();
                case 6 -> viewVeterinarians();
                case 7 -> viewTreatments();
                case 8 -> addVetOrder();
                case 9 -> viewVetOrders();
                case 0 -> {
                    System.out.println("Goodbye 👋");
                    running = false;
                }
                default -> System.out.println("Invalid choice ❌");
            }
            if (running) {
                System.out.println("\nPress Enter to continue...");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
    private static void displayMenu() {
        System.out.println("""
                🐾 VET CLINIC SYSTEM 🐾
                1. Add Owner👤
                2. View Owners📋
                3. Add Pet🐾
                4. View Pets🐶
                5. Add Veterinarian🩺
                6. View Veterinarians👨‍⚕️
                7. View Treatments💉
                8. Create Vet Order📝
                9. View Vet Orders📂
                0. Exit
                """);
    }
    // ---------------- ADD / VIEW METHODS ----------------
    private static void addOwner() {
        String name = readNonEmptyString("Enter name: ");
        String phonenumber = readNonEmptyString("Enter phone: ");
        owners.add(new Owner(name , phonenumber));
        System.out.println("Owner added successfully ✅");
    }
    private static void viewOwners() {
        if (owners.isEmpty()) {
            System.out.println("No owners found");
            return;
        }
        owners.forEach(System.out::println);
    }
    private static void addPet() {
        String nick = readNonEmptyString("Pet nickname: ");
        int age = readInt("Your pet's age: ");
        while (age < 0) {
            System.out.println("Age cannot be negative ❌");
            age = readInt("Your pet's age: ");
        }
        pets.add(new Pet(nick, age) {
            @Override
            public String getType() {
                return "";
            }
        });
        System.out.println("Pet added successfully ✅");
    }
    private static void viewPets() {
        if (pets.isEmpty()) {
            System.out.println("No pets found");
            return;
        }
        pets.forEach(System.out::println);
    }
    private static void addVeterinarian() {
        String fullname = readNonEmptyString("Name: ");
        int exp = readInt("Experience years: ");
        while (exp < 0) {
            System.out.println("Invalid data ❌");
            exp = readInt("Experience years: ");
        }
        veterinarians.add(new Veterinarian(fullname, exp));
        System.out.println("Veterinarian added ✅");
    }
    private static void viewVeterinarians() {
        if (veterinarians.isEmpty()) {
            System.out.println("No veterinarians found ❌");
            return;
        }
        veterinarians.forEach(System.out::println);
    }
    private static void viewTreatments() {
        if (treatments.isEmpty()) {
            System.out.println("No treatments available ❌");
            return;
        }

        int index = chooseFromList("Choose treatment:", treatments);
        Treatment selectedTreatment = treatments.get(index);

        System.out.println("Selected treatment:");
        System.out.println(selectedTreatment);
        System.out.println("Price: " + selectedTreatment.getPrice());
    }


    private static void addVetOrder() {
        if (owners.isEmpty() || pets.isEmpty() || veterinarians.isEmpty()) {
            System.out.println("Not enough data to create order ❌");
            return;
        }
        int ownerIndex = chooseFromList("Choose owner:", owners);
        int petIndex = chooseFromList("Choose pet:", pets);
        int vetIndex = chooseFromList("Choose veterinarian:", veterinarians);
        int treatindex = chooseFromList("Choose treatment:", treatments);
        Treatment selectedTreatment = treatments.get(treatindex);

        System.out.println("Selected treatment:");
        System.out.println(selectedTreatment);
        System.out.println("Price: " + selectedTreatment.getPrice());

        Order order = new Order(
                owners.get(ownerIndex),
                pets.get(petIndex),
                veterinarians.get(vetIndex),
                treatments.get(treatindex)
        );
        vetOrders.add(order);
        System.out.println("Vet order created ✅");
    }
    private static void viewVetOrders() {
        if (vetOrders.isEmpty()) {
            System.out.println("No orders found");
            return;
        }
        vetOrders.forEach(System.out::println);
    }
    // ---------------- VALIDATION HELPERS ----------------
    private static int readInt(String message) {
        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                scanner.nextLine();
                return value;
            } else {
                System.out.println("Please enter a valid number ❌");
                scanner.nextLine();
            }
        }
    }
    private static long readLong(String message) {
        while (true) {
            System.out.print(message);
            if (scanner.hasNextLong()) {
                long value = scanner.nextLong();
                scanner.nextLine();
                return value;
            } else {
                System.out.println("Please enter a valid number ❌");
                scanner.nextLine();
            }
        }
    }
    private static String readNonEmptyString(String message) {
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.println("Cannot be empty ❌");
        }
    }
    private static <T> int chooseFromList(String title, ArrayList<T> list) {
        System.out.println(title);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ". " + list.get(i));
        }
        int index = readInt("Choose index: ");
        while (index < 0 || index >= list.size()) {
            System.out.println("Invalid index ❌");
            index = readInt("Choose index: ");
        }
        return index;
    }
}
