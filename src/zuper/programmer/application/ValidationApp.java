package zuper.programmer.application;

import zuper.programmer.data.LoginRequest;
import zuper.programmer.error.ValidationException;
import zuper.programmer.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("Umam", "Rahasia");
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        } catch (ValidationException | NullPointerException e) {
            System.out.println("Data tidak valid : " + e.getMessage());
        } finally {
            System.out.println("Selalu akan dieksekusi");
        }
        LoginRequest loginRequest2 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest2);
        System.out.println("Sukses");
    }
}
