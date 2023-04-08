public abstract class Employee implements Payable {

    private String firstName;
    private String lastName;
    private String social_security_number;

    public Employee() {
        this.firstName = "";
        this.lastName = "";
        this.social_security_number = "";
    }

    public Employee(String firstName, String lastName, String sin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.social_security_number = social_security_number;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getsocial_security_number() {
        return social_security_number;
    }

    public void setsocial_security_number(String sin) {
        this.social_security_number = sin;
    }

    public abstract double getPaymentAmount();

    @Override
    public String toString() {
        return "Employee #" + social_security_number + ": " + firstName + " " + lastName;
    }

}
