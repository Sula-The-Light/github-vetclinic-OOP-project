package DB;
import Model.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class VetDAO {
    public void insertAllData(
            Owner owner,
            Veterinarian vet,
            Pet pet,
            Treatment treatment,
            Order order
    ) { String sql = """
                INSERT INTO vetDAO (
                    owner_id, owner_name, owner_phone, owner_address,
                    vet_name, vet_phone, vet_experience,
                    pet_name, pet_age,
                    treatment_name, treatment_price,  
                    total_price
                )
                VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
                """;
        Connection connection = DatabaseConnection.getConnection();
        if (connection == null)
            return;
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, owner.getName());
            ps.setString(2, owner.getPhonenumber());
            ps.setString(3, vet.getFullname());
            ps.setInt(4, vet.getExperience());
            ps.setString(5, pet.getNickname());
            ps.setInt(6, pet.getAge());
            ps.setString(7, treatment.getTitle());
            ps.setDouble(8, treatment.getPrice());
            ps.setDouble(9, order.getTotalPrice());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DatabaseConnection.close(connection);
        }
    }
    public boolean updateOwner(long ownerId, String name, String phone, String address) {
        String sql = """
                UPDATE VetDAO
                SET owner_name = ?, owner_phone = ?, owner_address = ?
                WHERE owner_id = ?
                """;
        Connection connection = DatabaseConnection.getConnection();
        if (connection == null)
            return false;
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, name);
            ps.setString(2, phone);
            ps.setString(3, address);
            ps.setLong(4, ownerId);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            DatabaseConnection.close(connection);
        }
    }
    public boolean deleteByOwnerId(long ownerId) {
        String sql = """
        SELECT owner_name , owner_phone , pet_name , total_price
        FROM VetDAO
        DROP owner_id
        """;
        Connection connection = DatabaseConnection.getConnection();
                if(connection == null)
                    return false;
                try(PreparedStatement ps = connection.prepareStatement(sql)){
                    ps.setString(3 , "%" + id + "%");
                    ResultSet rs = ps.executeQuery();
                }
    }
    public void searchByOwnerName(String name) {
        String sql = """
                SELECT owner_name, owner_phone, pet_name, total_price
                FROM VetDAO
                WHERE owner_name ILIKE ?
                ORDER BY owner_name
                """;
        Connection connection = DatabaseConnection.getConnection();
        if (connection == null)
            return;
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, "%" + name + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                printOwnerInfo(
                        rs.getString("owner_name"),
                        rs.getString("owner_phone"),
                        rs.getString("pet_name"),
                        rs.getDouble("total_price")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DatabaseConnection.close(connection);
        }
    }
    public void searchByPriceRange(double min, double max) {
        String sql = """
                SELECT owner_name, total_price
                FROM VetDAO
                WHERE total_price BETWEEN ? AND ?
                ORDER BY total_price DESC
                """;
        Connection connection = DatabaseConnection.getConnection();
        if (connection == null)
            return;
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setDouble(1, min);
            ps.setDouble(2, max);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(
                        "Owner: " + rs.getString("owner_name") +
                                ", Total: " + rs.getDouble("total_price")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DatabaseConnection.close(connection);
        }
    }
    public void searchByMinPrice(double minPrice)
    private void printOwnerInfo(String owner, String phone, String pet, double total) {
        System.out.println(
                "Owner: " + owner +
                        ", Phone: " + phone +
                        ", Pet: " + pet +
                        ", Total: " + total
        );
    }
    public void insertOwner(Owner owner) {
    }
}