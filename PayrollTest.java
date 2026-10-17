public class PayrollTest {
    public static void main(String[] args) {

        Payable[] employees = {
            new SalariedEmployee("VU001", "John", 1500000),
            new HourlyEmployee("VU002", "Mary", 40, 10000)
        };

        double totalPayroll = 0;

        for (Payable employee : employees) {
            double amount = employee.getPaymentAmount();

            System.out.println("Payment: UGX " + amount);

            totalPayroll += amount;
        }

        System.out.println("Total Payroll: UGX " + totalPayroll);
    }
}
