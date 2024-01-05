package at.lus.basic.oop.Konto;

public class Bank {

    private Sparbuch sparbuch;
    private Girokonto girokonto;
    private Kreditkonto kreditkonto;

    public Bank(Sparbuch sparbuch, Girokonto girokonto, Kreditkonto kreditkonto) {
        this.sparbuch = sparbuch;
        this.girokonto = girokonto;
        this.kreditkonto = kreditkonto;
    }

    public void Einzahlen(String x, double betrag){
        if(x == "sparbuch"){
            double y = sparbuch.getSparbuchValue() + betrag;
            System.out.println("Sie haben " + betrag + " in ihr Sparkonto eingezahlt");
            getSparbuch().setSparbuchValue(y);
        }else if(x == "girokonto"){
            double y = girokonto.getGirokontoValue() + betrag;
            System.out.println(" Sie haben " + betrag + " in ihr Girokonto eingezahlt");
            getGirokonto().setGirokontoValue(y);
        }else if(x == "kreditkonto"){
            double y = kreditkonto.getKreditkontoValue() + betrag;
            if(y < getKreditkonto().getKreditkontoValue() + betrag){
                System.out.println("Sie haben " + betrag + " in ihr Kreditkonto eingezahlt");
            }else{
                System.out.println("Sie haben zu wenig Schulden, bitte kleineren Betrag wählen");
            }

        }else{
            System.out.println("Kein Konto gefunden");
        }
    }

    public void Auszahlen(String x, double betrag){
        if(x == "sparbuch"){
            double y = getSparbuch().getSparbuchValue() - betrag;
            if(y < 0){
                System.out.println("Sie haben zu wenig Geld");
            }else{
                System.out.println("Sie haben " + betrag + " ausgezahlt");
                getSparbuch().setSparbuchValue(y);
            }
        }else if(x == "girokonto"){
            double y = getGirokonto().getGirokontoValue() - betrag;
            if(y < getGirokonto().getGirokontoLimit()){
                System.out.println("Sie haben zu wenig Geld");
            }else{
                System.out.println("Sie haben " + betrag + " ausgezahlt");
                getGirokonto().setGirokontoValue(y);
            }
        }else if(x == "kreditkonto"){
            double y = getKreditkonto().getKreditkontoValue() - betrag;
            System.out.println("Sie haben " + betrag + " ausgezahlt");
            getKreditkonto().setKreditkontoValue(y);
        }else{
            System.out.println("Kein Konto gefunden");
        }
    }

    public void Saldo(String x){
        if(x == "sparbuch"){
            System.out.println(getSparbuch().getSparbuchValue());
        }else if (x == "girokonto"){
            System.out.println(getGirokonto().getGirokontoValue());
        }else if(x == "kreditkonto"){
            System.out.println(getKreditkonto().getKreditkontoValue());
        }else{
            System.out.println("Kein Konto gefunden");
        }
    }

    public Sparbuch getSparbuch() {
        return sparbuch;
    }

    public void setSparbuch(Sparbuch sparbuch) {
        this.sparbuch = sparbuch;
    }

    public Girokonto getGirokonto() {
        return girokonto;
    }

    public void setGirokonto(Girokonto girokonto) {
        this.girokonto = girokonto;
    }

    public Kreditkonto getKreditkonto() {
        return kreditkonto;
    }

    public void setKreditkonto(Kreditkonto kreditkonto) {
        this.kreditkonto = kreditkonto;
    }
}
