package aldovalzani.be_hw_m2_w1_d4.entities.alimento_child;

import aldovalzani.be_hw_m2_w1_d4.entities.Alimento;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Table(name = "bevande")
public class Drink extends Alimento {
    public Drink(double calories, String name, double prezzo) {
        super(calories, name, prezzo);
    }
}
