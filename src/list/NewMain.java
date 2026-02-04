package list;
import Model.*;
import java.util.ArrayList;
import DB.VetDAO;
import java.util.Scanner;
public class NewMain implements List {
    private static ArrayList<Owner> owners = new ArrayList<>();
    private static ArrayList<Pet> pets = new ArrayList<>();
    private static ArrayList<Veterinarian> veterinarians = new ArrayList<>();
    private static ArrayList<Order> vetOrders = new ArrayList<>();
    private static ArrayList<Treatment> treatments = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static VetDAO vetDAO = new VetDAO();
    public void insertAllData(
            Owner owner,
            Veterinarian vet,
            Pet pet,
            Treatment treatment,
            Order order
    )
    public boolean updateOwner(long ownerId, String name, String phone, String address) {
        String sql = """
                UPDATE VetDAO
                SET owner_name = ?, owner_phone = ?, owner_address = ?
                WHERE owner_id = ?
                """;}

    public void searchByOwnerName(String name) {
        String sql = """
                SELECT owner_name, owner_phone, pet_name, total_price
                FROM VetDAO
                WHERE owner_name ILIKE ?
                ORDER BY owner_name
                """;}
    public void searchByPriceRange(double min, double max) {
        String sql = """
                SELECT owner_name, total_price
                FROM VetDAO
                WHERE total_price BETWEEN ? AND ?
                ORDER BY total_price DESC
                """;}
    public void searchByMinPrice(double minPrice) {
        String sql = """
                SELECT owner_name, total_price
                FROM vet_all_data
                WHERE total_price >= ?
                ORDER BY total_price DESC
                """;}
    private void printOwnerInfo(String owner, String phone, String pet, double total) {
        System.out.println(
                "Owner: " + owner +
                        ", Phone: " + phone +
                        ", Pet: " + pet +
                        ", Total: " + total
        );
    }
    @Override
    public void run() {
        boolean running = true;
        while (running) {
            displayList();
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
                case 10 -> saveLastOrderToDB();
                case 11 -> updateOwnerInDB();
                case 12 -> deleteOwnerFromDB();
                case 13 -> searchByOwnerNameDB();
                case 14 -> searchByPriceRangeDB();
                case 0 -> {
                    System.out.println("Goodbye 👋");
                    running = false;
                }
                default -> System.out.println("Invalid choice ❌");
            } if (running) {
                System.out.println("\nPress Enter to continue...");
                scanner.nextLine();
            }
        } scanner.close();
    }

    public void displayList() {
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
                10. Save last order to DB 💾
                11. Update owner in DB ✏️
                12. Delete owner from DB 🗑️
                13. Search by owner name 🔍
                14. Search by price range 💰
                0. Exit
                """);
    }
    // ---------------- ADD / VIEW METHODS ----------------
    private static void addOwner() {
        try {
            String name = readNonEmptyString("Enter name: ");
            String phone = readNonEmptyString("Enter phone: ");
            owners.add(new Owner(name, phone));
            System.out.println("Owner added successfully ✅");
        } catch (IllegalArgumentException d) {
            System.out.println(d.getMessage() + " ❌");
        }
    }
    private static void viewOwners() {
        if (owners.isEmpty()) {
            System.out.println("No owners found ❌");
            return;
        }
        owners.forEach(System.out::println);
    }
    private static void addPet() {
        try {
            String nick = readNonEmptyString("Pet nickname: ");
            int age = readInt("Pet age: ");
            String type = readNonEmptyString("Type (cat/dog): ").toLowerCase();
            Pet pet;
            if (type.equals("cat")) {
                pet = new Cat(nick, age);
            } else if (type.equals("dog")) {
                pet = new Dog(nick, age);
            } else {
                System.out.println("Unknown pet type ❌");
                return;
            }
            pets.add(pet);
            System.out.println("Pet added successfully ✅");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage() + " ❌");
        }
    }
    private static void viewPets() {
        if (pets.isEmpty()) {
            System.out.println("No pets found ❌");
            return;
        }
        pets.forEach(System.out::println);
    }
    private static void addVeterinarian() {
        try {
            String fullname = readNonEmptyString("Name: ");
            int exp = readInt("Experience years: ");
            veterinarians.add(new Veterinarian(fullname, exp));
            System.out.println("Veterinarian added ✅");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage() + " ❌");
        }
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
            System.out.println("No orders found ❌");
            return;
        }
        vetOrders.forEach(System.out::println);
    }
    private static void saveLastOrderToDB() {
        if (vetOrders.isEmpty()) {
            System.out.println("No orders to save ❌");
            return;
        }

        Order order = vetOrders.get(vetOrders.size() - 1);

        vetDAO.insertAllData(
                order.getOwner(),
                order.getVeterinarian(),
                order.getPet(),
                order.getTreatment(),
                order
        );
        System.out.println("Order saved to database ✅");
    }
    private static void updateOwnerInDB() {
        long id = readLong("Owner ID: ");
        String name = readNonEmptyString("New name: ");
        String phone = readNonEmptyString("New phone: ");
        String address = readNonEmptyString("New address: ");

        boolean updated = vetDAO.updateOwner(id, name, phone, address);

        if (updated)
            System.out.println("Owner updated successfully ✅");
        else
            System.out.println("Owner not found ❌");
    }

    private static void deleteOwnerFromDB() {
        long id = readLong("Owner ID to delete: ");

        boolean deleted = vetDAO.deleteByOwnerId(id);

        if (deleted)
            System.out.println("Owner deleted successfully 🗑️");
        else
            System.out.println("Owner not found ❌");
    }

    private static void searchByOwnerNameDB() {
        String name = readNonEmptyString("Enter owner name: ");
        vetDAO.searchByOwnerName(name);
    }

    private static void searchByPriceRangeDB() {
        double min = readInt("Min price: ");
        double max = readInt("Max price: ");
        vetDAO.searchByPriceRange(min, max);
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
