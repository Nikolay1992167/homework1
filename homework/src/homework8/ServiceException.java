package homework8;

public class ServiceException extends RuntimeException{
    public ServiceException(String errorMessage){
        super(errorMessage);
    }
}
