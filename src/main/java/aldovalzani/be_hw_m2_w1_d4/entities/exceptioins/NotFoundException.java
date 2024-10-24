package aldovalzani.be_hw_m2_w1_d4.entities.exceptioins;

public class NotFoundException extends RuntimeException {
    public NotFoundException(long id) {
        super("La risorsa con id " + id + " non è stata trovata!");
    }
}
