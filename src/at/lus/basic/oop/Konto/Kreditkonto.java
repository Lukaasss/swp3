package at.lus.basic.oop.Konto;

public class Kreditkonto {

    private double kreditkontoValue;
    private double KreditkontoLimit;



    public Kreditkonto(double kreditkontoValue, double kreditkontoLimit) {
        this.kreditkontoValue = kreditkontoValue;
        KreditkontoLimit = kreditkontoLimit;
    }




    public double getKreditkontoValue() {
        return kreditkontoValue;
    }

    public void setKreditkontoValue(double kreditkontoValue) {
        this.kreditkontoValue = kreditkontoValue;
    }

    public double getKreditkontoLimit() {
        return KreditkontoLimit;
    }

    public void setKreditkontoLimit(double kreditkontoLimit) {
        KreditkontoLimit = kreditkontoLimit;
    }
}
