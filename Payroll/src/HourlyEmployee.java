public class HourlyEmployee extends Employee {

    /** The wage. */
    private double wage;

    /** The hours worked. */
    private double hours;

    /**
     * Constructs an hourly employee with specified name, sin, wage, and hours worked
     *
     * @param firstName the first name of the employee
     * @param lastName the last name of the employee
     * @param sin social insurance number of the employee
     * @param wage hourly wage of the employee
     * @param hours hours worked by the employee
     */
    public HourlyEmployee(String firstName, String lastName, String sin, double wage, double hours) {
        super(firstName, lastName, sin);
        this.wage = wage;
        this.hours = hours;
    }

    /**
     * Constructs a default hourly employee
     */
    public HourlyEmployee() {
        super();
        this.wage = 0.0;
        this.hours = 0.0;
    }

    /**
     * Gets the hourly employee's amount of pay
     *
     * @return returns the payment amount of this hourly employee
     */
    @Override
    public double getPaymentAmount() {
        return wage * hours;
    }

    @Override
    public String toString() {
        return super.toString() + ": $" + getPaymentAmount();
    }

}
