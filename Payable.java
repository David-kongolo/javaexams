interface Payable {
    double getPaymentAmount();
}

abstract class Employee implements Payable {
    private String staffID;
    private String name;

    public Employee(String staffID, String name) {
        this.staffID = staffID;
        this.name = name;
    }

    public abstract double calculatePay();

    @Override
    public double getPaymentAmount() {
        return calculatePay();
    }

    @Override
    public String toString() {
        return staffID + " " + name;
    }
}