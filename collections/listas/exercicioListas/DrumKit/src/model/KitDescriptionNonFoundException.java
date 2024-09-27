package model;

public class KitDescriptionNonFoundException extends  RuntimeException{

    public KitDescriptionNonFoundException() {}

    public KitDescriptionNonFoundException(String message) {
        super(message);
    }
}
