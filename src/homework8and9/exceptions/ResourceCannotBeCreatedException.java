package homework8and9.exceptions;

public class ResourceCannotBeCreatedException extends RuntimeException {
    public ResourceCannotBeCreatedException() {
    }

    public ResourceCannotBeCreatedException(String message) {
        super(message);
    }

    public ResourceCannotBeCreatedException(String message, Throwable cause) {
        super(message, cause);
    }
}
