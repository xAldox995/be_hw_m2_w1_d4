package aldovalzani.be_hw_m2_w1_d4.repositories;

import aldovalzani.be_hw_m2_w1_d4.entities.alimento_child.Topping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface ToppingRepo extends JpaRepository<Topping, Long> {
    Optional<Topping> findByName(String name);
}
