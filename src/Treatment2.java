public class Treatment2 {
    private String name;
    private double price;
    private int expiryDate;
    private boolean prescriptionRequired;

    public Treatment2(String name, double price, int expiryDate, boolean prescriptionRequired) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.prescriptionRequired = prescriptionRequired;
    }

    public boolean isExpired(int currentYear) {
        return currentYear > expiryDate;
    }

    public void increasePrice(double amount) {
        this.price += amount;
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

    public boolean isPrescriptionRequired() {
        return prescriptionRequired;
    }

    public void setPrescriptionRequired(boolean prescriptionRequired) {
        this.prescriptionRequired = prescriptionRequired;
    }

    @Override
    public String toString() {
        return "Treatment2{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", expiryDate=" + expiryDate +
                ", prescriptionRequired=" + prescriptionRequired +
                '}';
    }

    public Treatment2(String paracetamol, int i, int i1) {
            }
    }

