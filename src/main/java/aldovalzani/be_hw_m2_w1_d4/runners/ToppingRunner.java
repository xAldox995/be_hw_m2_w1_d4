package aldovalzani.be_hw_m2_w1_d4.runners;

import aldovalzani.be_hw_m2_w1_d4.entities.alimento_child.Topping;
import aldovalzani.be_hw_m2_w1_d4.services.ToppingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@Slf4j
public class ToppingRunner implements CommandLineRunner {

    @Autowired
    private ToppingService toppingService;

    @Override
    public void run(String... args) throws Exception {
        /*
        TEST AGGIUNTA TOPPING  VVV
        Topping prosciuttoCotto = new Topping(125, "prosciutto_cotto", 0.35);
        Topping salamePiccante = new Topping(160, "pepperoni_salami", 0.15);

        try {
            toppingService.saveTopping(prosciuttoCotto);
            toppingService.saveTopping(salamePiccante);

        } catch (ValidationException ex) {
            log.error(ex.getMessage());
        }
        */

        Optional<Topping> condimentoFound = toppingService.findToppByName("caciara");
        log.info(condimentoFound.toString());
    }
}
