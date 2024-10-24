package aldovalzani.be_hw_m2_w1_d4.services;


import aldovalzani.be_hw_m2_w1_d4.entities.alimento_child.Topping;
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
        toppingRepo.save(topping);
    }
}
