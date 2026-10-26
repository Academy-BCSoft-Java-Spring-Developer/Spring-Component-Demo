package bcsoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Smartphone {

    private final Batteria batteria;
    private String modello = "Pixel 8";

    @Autowired
    public Smartphone(Batteria batteria) {
        this.batteria = batteria;
        System.out.println("-> [Spring Container] Istanza di Smartphone creata con la Batteria iniettata.");
    }

    public void accendi() {
        System.out.println("Dispositivo: " + modello);
        System.out.println("Capacità: " + batteria.getCapacitaMah() + " mAh");
        System.out.println("Carica: " + batteria.getLivelloCarica() + "%");
    }

    public void usaApp(String nomeApp, int consumo) {
        System.out.println("Avvio app: " + nomeApp);
        batteria.scarica(consumo);
    }
}