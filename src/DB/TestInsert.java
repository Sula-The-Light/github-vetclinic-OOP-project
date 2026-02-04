package DB;
import Model.Owner;
public class TestInsert {
    public static void main(String[] args) {
        Owner owner = new Owner("Aibek", "546246546");
        VetDAO dao = new VetDAO();
        dao.insertOwner(owner);
    }
}
