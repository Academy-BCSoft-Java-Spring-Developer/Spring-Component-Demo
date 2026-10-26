package bcsoft;

import org.springframework.stereotype.Component;

@Component
public class Batteria {

    private int livelloCarica = 100;
    private int capacitaMah = 5000;

    public Batteria() {
        System.out.println("-> [Spring Container] Istanza di Batteria creata.");
    }

    public void scarica(int quantita) {
        this.livelloCarica = Math.max(0, this.livelloCarica - quantita);
        System.out.println("Batteria scaricata di " + quantita + "%. Residuo: " + this.livelloCarica + "%");
    }

    public int getLivelloCarica() {
        return livelloCarica;
    }

    public int getCapacitaMah() {
        return capacitaMah;
    }
}