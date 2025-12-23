public class Treatment2 {
    private String name;
    private double price;
    private int expiryDate;

    public Treatment2(String name, double price, int expiryDate) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(int expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "Treatment2{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", expiryDate=" + expiryDate +
                '}';
    }
}
