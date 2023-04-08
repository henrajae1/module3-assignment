/**
 * The class SalariedEmployee.
 */
public class SalariedEmployee extends Employee {

    /** The weekly salary. */
    private double weeklySalary;

    /**
     * Instantiates a new SalariedEmployee.
     */
    public SalariedEmployee() {
        this.weeklySalary = 0.0;
    }

    /**
     * Instantiates a new SalariedEmployee.
     *
     * @param firstName the first name
     * @param lastName the last name
     * @param sin the sin
     * @param weeklySalary the weekly salary
     */
    public SalariedEmployee(String firstName, String lastName, String sin, double weeklySalary) {
        super(firstName, lastName, sin);
        this.weeklySalary = weeklySalary;
    }

    /**
     * Gets the payment amount.
     *
     * @return the payment amount
     */
    @Override
    public double getPaymentAmount() {
        return weeklySalary;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return super.toString() + ": $" + getPaymentAmount();
    }

}
