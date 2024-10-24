package aldovalzani.be_hw_m2_w1_d4.repositories;

import aldovalzani.be_hw_m2_w1_d4.entities.alimento_child.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepo extends JpaRepository<Pizza, Long> {
}
