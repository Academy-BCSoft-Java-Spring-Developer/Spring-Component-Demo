package bcsoft;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "bcsoft")
public class App {

    public static void main(String[] args) {
        // Avvia il container Spring leggendo la configurazione di questa classe
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);

        System.out.println("\n--- Contesto inizializzato: recupero Smartphone ---");
        
        // Recupero del Bean gestito da Spring
        Smartphone smartphone = context.getBean(Smartphone.class);
        
        // Test dei metodi
        smartphone.accendi();
        smartphone.usaApp("YouTube", 20);
        smartphone.usaApp("Google Maps", 15);

        // Chiusura del contesto
        context.close();
    }
}