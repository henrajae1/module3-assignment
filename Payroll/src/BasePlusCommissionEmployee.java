//Karena Galloway Id# 1917009411
//Rajae Henry Id# 2101012994
//Jahvell Strachan Id# 1817003544
//Shameka Taylor id # 1817002318
//Anna-Kay Francis Id # 2101013079
//Treshawna Hutchinson Id#  1917009306



public class BasePlusCommissionEmployee extends CommissionEmployee {

    /** The base salary. */
    private double baseSalary;

    /**
     * Instantiates a new base plus commission employee with default values.
     */
    public BasePlusCommissionEmployee() {
        super();
        this.baseSalary = 0;
    }

    /**
     * Instantiates a new base plus commission employee.
     *
     * @param firstName the first name
     * @param lastName the last name
     * @param sin the social insurance number
     * @param sales the gross sales
     * @param rate the commission rate
     * @param baseSalary the base salary
     */
    public BasePlusCommissionEmployee(String firstName, String lastName, String sin, double sales, double rate,
                                      double baseSalary) {
        super(firstName, lastName, sin, sales, rate);
        this.baseSalary = baseSalary;
    }

    /**
     * Gets the payment amount.
     *
     * @return the payment amount
     */
    @Override
    public double getPaymentAmount() {
        return baseSalary + super.getPaymentAmount();
    }
}
