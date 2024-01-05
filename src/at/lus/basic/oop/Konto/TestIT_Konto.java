package at.lus.basic.oop.Konto;

public class TestIT_Konto {

    public static void main(String[] args) {
        Sparbuch sparbuch = new Sparbuch(200);
        Girokonto girokonto = new Girokonto(200, -1);
        Kreditkonto kreditkonto = new Kreditkonto(-300, 0);
        Bank bank = new Bank(sparbuch, girokonto, kreditkonto);

        bank.Einzahlen("sparbuch", 100);
        bank.Einzahlen("girokonto", 10);
        bank.Einzahlen("kreditkonto", 100);

        bank.Auszahlen("sparbuch", 200);
        bank.Auszahlen("girokonto", 280);
        bank.Auszahlen("kreditkonto", 100);

        bank.Saldo("sparbuch");
        bank.Saldo("girokonto");
        bank.Saldo("kreditkonto");
    }
}