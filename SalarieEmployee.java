class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee(String staffID, String name, double salary) {
        super(staffID, name);

        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }

        this.salary = salary;
    }

    @Override
    public double calculatePay() {
        return salary;
    }
}
