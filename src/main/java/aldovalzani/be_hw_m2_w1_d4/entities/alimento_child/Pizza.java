package aldovalzani.be_hw_m2_w1_d4.entities.alimento_child;

import aldovalzani.be_hw_m2_w1_d4.entities.Alimento;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Table(name = "pizze")
public class Pizza extends Alimento {
    List<Topping> condimenti;

    public Pizza(double calories, String name, double prezzo) {
        super(calories, name, prezzo);
        this.condimenti = new ArrayList<>();
    }
}
