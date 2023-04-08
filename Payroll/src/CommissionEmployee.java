public class CommissionEmployee extends Employee {
    protected double grossSales; // gross sales
    protected double commissionRate; // rate of commission

    /**
     * Constructs a commissioned employee with specified name, sin, gross sales
     * and commission rate
     *
     * @param firstName name of employee
     * @param lastName  last name of employee
     * @param sin       social insurance number of employee
     * @param sales     gross sales made by employee
     * @param rate      commission rate of employee
     */
    public CommissionEmployee(String firstName, String lastName, String sin, double sales, double rate) {
        super(firstName, lastName, sin);
        this.grossSales = sales;
        this.commissionRate = rate;
    }

    /**
     * Constructs a default commissioned employee
     */
    public CommissionEmployee() {
        super();
        this.grossSales = 0.0;
        this.commissionRate = 0.0;
    }

    /**
     * Gets the commissioned employee's amount of pay
     *
     * @return returns the payment amount of this commissioned employee
     */
    @Override
    public double getPaymentAmount() {
        return commissionRate * grossSales;
    }

    @Override
    public String toString() {
        return super.toString() + ": $" + getPaymentAmount();
    }
}
