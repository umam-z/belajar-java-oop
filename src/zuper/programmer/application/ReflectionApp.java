package zuper.programmer.application;

import zuper.programmer.data.CreateUserRequest;
import zuper.programmer.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {
        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("Umam");
        request.setPassword("umam");
        ValidationUtil.validationReflection(request);
    }
}
