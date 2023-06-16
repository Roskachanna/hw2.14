package hw;

public class StorageIsNullItemException extends RuntimeException {
    public StorageIsNullItemException() {
    }

    public StorageIsNullItemException(String message) {
        super(message);
    }

    public StorageIsNullItemException(String message, Throwable cause) {
        super(message, cause);
    }

    public StorageIsNullItemException(Throwable cause) {
        super(cause);
    }

    public StorageIsNullItemException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
