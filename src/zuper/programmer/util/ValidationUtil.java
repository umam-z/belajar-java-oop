package zuper.programmer.util;

import zuper.programmer.data.LoginRequest;
import zuper.programmer.error.ValidationException;

public class ValidationUtil {
    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException{
        if (loginRequest.username() == null) {
            throw new NullPointerException("username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationException("username is blank");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("password is null");
        } else if (loginRequest.password().isBlank()) {
            throw new ValidationException("password is blank");
        } 
    }
}
