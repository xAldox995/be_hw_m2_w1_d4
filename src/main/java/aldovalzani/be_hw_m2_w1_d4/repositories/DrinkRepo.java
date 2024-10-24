package aldovalzani.be_hw_m2_w1_d4.repositories;

import aldovalzani.be_hw_m2_w1_d4.entities.alimento_child.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DrinkRepo extends JpaRepository<Drink, Long> {
}
