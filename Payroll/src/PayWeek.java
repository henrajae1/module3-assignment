
import java.util.ArrayList;

public class PayWeek {

    private String weekEnding; // last day of pay week

    private ArrayList<Payable> payments; // list of payable items

    public PayWeek(String weekEnding) {

        this.weekEnding = weekEnding;

        payments = new ArrayList<>();

    }


    public void addPayment(Payable p) {

        payments.add(p);

    }



    @Override

    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Payments for the week ending " + weekEnding + ": \n");

        for (Payable p : payments) {

            sb.append(p + "\n");

        }

        return sb.toString();

    }

}

//2 import java.util.ArrayList; Hem in 4 public class Payweek { 6 private String weekEnding; // last day of pay week private Ar

 