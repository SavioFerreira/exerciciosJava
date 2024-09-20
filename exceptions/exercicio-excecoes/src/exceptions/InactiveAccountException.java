package exceptions;

public class InactiveAccountException extends AccountException {

    public InactiveAccountException(String message) {
        super(message);
    }

    public InactiveAccountException(String message, Throwable cause) {
        super(message, cause);
    }
}
