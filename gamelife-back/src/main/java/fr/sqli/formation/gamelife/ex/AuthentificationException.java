package fr.sqli.formation.gamelife.ex;

public class AuthentificationException extends Exception{



    public AuthentificationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public AuthentificationException() {
    }

    public AuthentificationException(String message) {
        super(message);
    }

    public AuthentificationException(String message, Throwable cause) {
        super(message, cause);
    }

    public AuthentificationException(Throwable cause) {
        super(cause);
    }
}
