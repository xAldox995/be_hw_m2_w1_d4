package aldovalzani.be_hw_m2_w1_d4.entities.alimento_child;

import aldovalzani.be_hw_m2_w1_d4.entities.Alimento;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Table(name = "pizze")
public class Pizza extends Alimento {
    @OneToMany
    @JoinTable(
            name = "toppings_pizze",
            joinColumns = @JoinColumn(name = "topping_id"),
            inverseJoinColumns = @JoinColumn(name = "pizza_id")
    )
    List<Topping> condimenti;

    public Pizza(double calories, String name, double prezzo) {
        super(calories, name, prezzo);
        this.condimenti = new ArrayList<>();
    }

    public void addCondimento(Topping topping) {
        condimenti.add(topping);
        setPrezzo(getPrezzo() + topping.getPrezzo());
        setCalories(getCalories() + topping.getCalories());
    }

}
