public class Treatment {
    private String title;
    private double price;
    public Treatment(String title, double price) {
        this.title = title;
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Treatment name required");
        }
        this.title = title;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be positive");
        }
        this.price = price;
    }
    @Override
    public String toString() {
        return "Treatment : " +
                "title = " + title +
                ", price = " + price +
                '}';
    }
}

