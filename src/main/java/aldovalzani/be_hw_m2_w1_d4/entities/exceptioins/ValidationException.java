package aldovalzani.be_hw_m2_w1_d4.entities.exceptioins;

public class ValidationException extends RuntimeException {
    public ValidationException(String message) {
        super(message);
    }
}
