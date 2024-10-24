package aldovalzani.be_hw_m2_w1_d4.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "alimenti")
@Getter
@Setter
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Alimento {
    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    private long id;
    private String name;
    private double calories;
    private double prezzo;

    public Alimento(double calories, String name, double prezzo) {
        this.calories = calories;
        this.name = name;
        this.prezzo = prezzo;
    }
}

