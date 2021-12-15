package lesson11;

public class travelCheckPoint extends Exception{
    public travelCheckPoint() {
    }

    public travelCheckPoint(String message) {
        super(message);
    }

    public travelCheckPoint(String message, Throwable cause) {
        super(message, cause);
    }

    public travelCheckPoint(Throwable cause) {
        super(cause);
    }

    public travelCheckPoint(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

