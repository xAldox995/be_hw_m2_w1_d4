package aldovalzani.be_hw_m2_w1_d4.entities.alimento_child;

import aldovalzani.be_hw_m2_w1_d4.entities.Alimento;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Table(name = "condimenti")
public class Topping extends Alimento {
    @ManyToMany(mappedBy = "condimenti")
    List<Pizza> pizze;

    public Topping(double calories, String name, double prezzo) {
        super(calories, name, prezzo);
        this.pizze = new ArrayList<>();
    }
}
