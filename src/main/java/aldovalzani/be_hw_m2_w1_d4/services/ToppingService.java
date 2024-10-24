package aldovalzani.be_hw_m2_w1_d4.services;


import aldovalzani.be_hw_m2_w1_d4.entities.alimento_child.Topping;
import aldovalzani.be_hw_m2_w1_d4.exceptions.ValidationException;
import aldovalzani.be_hw_m2_w1_d4.repositories.ToppingRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ToppingService {
    @Autowired
    private ToppingRepo toppingRepo;

    public void saveTopping(Topping topping) {
        Topping toppingEsistente = toppingRepo.findByName(topping.getName());
        if (toppingEsistente != null) throw new ValidationException("Esiste già questo condimento");
        toppingRepo.save(topping);
        log.info("Condimento con id " + topping.getId() + " è stato salvato");
    }
}
